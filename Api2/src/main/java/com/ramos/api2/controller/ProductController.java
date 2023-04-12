package com.ramos.api2.controller;

import com.ramos.api2.model.Product;
import com.ramos.api2.service.ProductService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author javierrampob
 */
@RestController
@RequiredArgsConstructor
public class ProductController {
    
    private final ProductService productService;

    @GetMapping("/product")
    public List<Product> listProduct() {
        return productService.listProducts();
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer id) {
        try {
            Product product = productService.getProductById(id);
            return ResponseEntity.ok(product);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/product")
    public void newProduct(@RequestBody Product product) {
        productService.saveProduct(product);
    }

    @PutMapping("/product/{id}")
    public ResponseEntity<?> editProduct(@RequestBody Product product, @PathVariable Integer id) {
        try {
            Product productExist = productService.getProductById(id);
            productExist.setUsername(product.getUsername());
            productExist.setEmail(product.getEmail());
            productService.saveProduct(productExist);
            return new ResponseEntity<Product>(product, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable Integer id) {
        productService.removeProduct(id);
    }
}
