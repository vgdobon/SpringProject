/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springaplication.app.repository;

import com.mycompany.springaplication.app.model.Employe;
import com.mycompany.springaplication.app.service.EmployeService;
import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vgd_9
 */
@Repository
@Transactional

public interface EmployeRepository extends JpaRepository<Employe, Long>{
    
    /**
     *
     */
    
    
    
}
