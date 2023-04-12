/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ramos.api2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Form {
     @Id @GeneratedValue 
    private Integer id;
    private String formName;
    private String formLastName;
    
    private String formSecondLastName;
    private String formStreet;
    private String formEmail;
    
    private String formNif;
    private String formDate;
    private boolean formFamilyNumber;
    
    private boolean formOldMayor;
    private String formGender;
    private String formColor;
}
