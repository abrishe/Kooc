package com.ramos.api2.repository;

import com.ramos.api2.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author javierrampob
 */
public interface ProductRepository extends JpaRepository<Product, Integer>{
    
}
