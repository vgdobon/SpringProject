/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springaplication.app.controller;

import com.mycompany.springaplication.app.model.Employe;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author vgd_9
 */

@RestController
@RequestMapping  (value ="/employee")
public class EmployeController {
    
    @GetMapping (value = "/list" , produces="applicacion/json")
    public List<Employe> getListEmployes(){
        List<Employe> employes = new ArrayList<>();
        
        Employe e1 = new Employe("Victor", 29, 4000);
        Employe e2 = new Employe("Maria", 40, 2000);
        
        employes.add(e1);
        employes.add(e2);
        
        return employes;
    }
}
