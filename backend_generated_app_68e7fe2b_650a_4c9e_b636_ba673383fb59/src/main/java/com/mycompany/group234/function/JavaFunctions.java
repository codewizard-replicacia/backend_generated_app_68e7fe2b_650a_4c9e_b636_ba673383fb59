package com.mycompany.group234.function;

import com.mycompany.group234.model.ShoppingCart;
import com.mycompany.group234.model.ProductInStock;
import com.mycompany.group234.model.UserProfile;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.mycompany.group234.repository.ShoppingCartRepository;
import com.mycompany.group234.repository.UserProfileRepository;
import com.mycompany.group234.repository.ProductInStockRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
