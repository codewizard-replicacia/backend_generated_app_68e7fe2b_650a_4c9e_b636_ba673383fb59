package com.mycompany.group234.repository;


import com.mycompany.group234.model.ShoppingCart;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class ShoppingCartRepository extends SimpleJpaRepository<ShoppingCart, String> {
    private final EntityManager em;
    public ShoppingCartRepository(EntityManager em) {
        super(ShoppingCart.class, em);
        this.em = em;
    }
    @Override
    public List<ShoppingCart> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"ShoppingCart\"", ShoppingCart.class).getResultList();
    }
}