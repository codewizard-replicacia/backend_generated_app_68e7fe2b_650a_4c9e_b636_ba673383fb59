package com.mycompany.group234.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.mycompany.group234.model.ShoppingCart;
import com.mycompany.group234.model.ProductInStock;
import com.mycompany.group234.model.UserProfile;

@Entity(name = "ShoppingCartProducts")
@Table(schema = "\"generated_app\"", name = "\"ShoppingCartProducts\"")
@Data
public class ShoppingCartProducts{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"CartId\"")
	private Integer cartId;

    
    @Column(name = "\"ProductId\"")
    private Long productId;
 
}