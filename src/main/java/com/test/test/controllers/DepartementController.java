package com.test.test.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.test.dao.DepartementRepository;
import com.test.test.models.Departement;
 

@Transactional
@RestController
@RequestMapping(value = "api/departement")
@CrossOrigin(origins = "*")
public class DepartementController {
	
	@Autowired
	DepartementRepository departementrepo;
	
	

    @GetMapping 
    public List<Departement> getAll() {
    	return departementrepo.findAll();
    }
    
    @PostMapping() 
    public Departement add(@RequestBody Departement d) {
     
    	return  departementrepo.save(d);
    }

}
