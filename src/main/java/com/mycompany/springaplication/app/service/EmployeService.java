/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springaplication.app.service;

import com.mycompany.springaplication.app.model.Employe;
import com.mycompany.springaplication.app.repository.EmployeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vgd_9
 */

@Service
public class EmployeService {
    
    @Autowired
    EmployeRepository repository;
    
    public List<Employe> listAll(){
        

        return repository.findAll();
    }
    
}
