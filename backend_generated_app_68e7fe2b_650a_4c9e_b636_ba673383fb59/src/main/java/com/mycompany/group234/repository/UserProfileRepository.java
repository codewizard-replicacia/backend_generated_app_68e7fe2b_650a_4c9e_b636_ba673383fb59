package com.mycompany.group234.repository;


import com.mycompany.group234.model.UserProfile;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class UserProfileRepository extends SimpleJpaRepository<UserProfile, String> {
    private final EntityManager em;
    public UserProfileRepository(EntityManager em) {
        super(UserProfile.class, em);
        this.em = em;
    }
    @Override
    public List<UserProfile> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"UserProfile\"", UserProfile.class).getResultList();
    }
}