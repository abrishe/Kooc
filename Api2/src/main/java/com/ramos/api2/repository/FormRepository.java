package com.ramos.api2.repository;

import com.ramos.api2.model.Form;
import com.ramos.api2.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author javierrampob
 */
public interface FormRepository extends JpaRepository<Form, Integer>{

    public Form findAllById(Integer id);
    
}


