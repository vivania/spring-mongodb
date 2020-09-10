package com.mongodb.api.model;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level=AccessLevel.PRIVATE)
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Seance {
	
	@Field(value="IdSportifEntraineur")
	String idSportifEntraineur;
	
	@Field(value="Jour")
	String jour;
	
	@Field(value="Horaire")
	String horaire;
	
	@Field(value="Duree")
	String duree;
	
	@Field(value="Libelle")
	private String libelle;
}
