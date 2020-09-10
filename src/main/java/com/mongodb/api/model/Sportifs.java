package com.mongodb.api.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data 
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection="Sportifs")
public class Sportifs {
	
	@Field(value="IdSportif")
	int idSportif;
	
	@Field(value="Nom")
	String nom;
	
	@Field(value="Prenom")
	String prenom;
	
	@Field(value="Sexe")
	String sexe;
	
	@Field(value="Age")
	int age;
	
	@Field(value="IdSportifConseiller")
	int idSportifConseiller;
	
	@Field(value="Sports")
	Sports sports;

}
