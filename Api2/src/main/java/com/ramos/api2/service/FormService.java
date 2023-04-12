
package com.ramos.api2.service;

import com.ramos.api2.model.Form;
import com.ramos.api2.model.Product;
import com.ramos.api2.repository.FormRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author javierrampob
 */
@Service
public class FormService {
    @Autowired 
    private FormRepository formRepository;
    
    
    public List<Form>listForms(){
        
        return formRepository.findAll();
    }
    
    public void saveForm(Form form){
        formRepository.save(form);
    }
    
    public Form getFormById(Integer id){
        return formRepository.findById(id).get();
    }
    
    public void editForm(Form form, Integer id){
       formRepository.existsById(id);
   }
    
    public void removeForm (Integer id){
        formRepository.deleteById(id);
    }
    
}
