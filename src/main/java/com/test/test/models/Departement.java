package com.test.test.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity 
@Table(name ="departement" , uniqueConstraints = {
        @UniqueConstraint(columnNames = {
            "nom"
        })}
        )
public class Departement {

	
	 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	
	
	public Departement() {
		 
	}


	


	public Departement(Long id, String nom) {
		this.id = id;
		this.nom = nom;
	}





	public String getNom() {
		return nom;
	}


	public Long getId() {
		return id;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
	
}
