package com.test.test.dao;
 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.test.models.Departement; 

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Long>{
 
}
