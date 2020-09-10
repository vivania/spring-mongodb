package com.mongodb.api.model;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

 @Setter
 @Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document(collection ="Gymnases")
public class Gymnases {
	
	private String _id;
	
	@Field(value="IdGymnase")
	private Long  idGymnase;
	
	@Field(value="Adresse")
	private String adresse;
	
	@Field(value="Ville")
	private String ville;
	
	@Field(value="NomGymnase")
	private String nomGymnase; 
	
	@Field(value="Surface")
	private int surface;
	
	/* @Field(value="Seances") */
	//private Seance[] seance;
	
} 
