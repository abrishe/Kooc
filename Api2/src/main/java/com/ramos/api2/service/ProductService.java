package com.ramos.api2.service;

import com.ramos.api2.model.Product;
import com.ramos.api2.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author javierrampob
 */
@Service
public class ProductService {
    @Autowired 
    private ProductRepository productRepository;
    
    
    public List<Product>listProducts(){
        
        return productRepository.findAll();
    }
    
    public void saveProduct(Product product){
        productRepository.save(product);
    }
    
    public Product getProductById(Integer id){
        return productRepository.findById(id).get();
    }
    
    public void editProduct(Product product, Integer id){
       productRepository.existsById(id);
   }
    
    public void removeProduct (Integer id){
        productRepository.deleteById(id);
    }
    
}
