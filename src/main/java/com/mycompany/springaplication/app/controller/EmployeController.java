/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springaplication.app.controller;

import com.mycompany.springaplication.app.model.Employe;
import com.mycompany.springaplication.app.service.EmployeService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    @Autowired
    EmployeService employeService ;
    
    @GetMapping (value = "/list" , produces="applicacion/json")
    public List<Employe> getListEmployes(){
        List<Employe> employes = n
        
        return employes;
    }
}
