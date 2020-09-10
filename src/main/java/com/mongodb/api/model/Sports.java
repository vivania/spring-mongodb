package com.mongodb.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor 
@NoArgsConstructor
@Document(collection = "Sports")
public class Sports {
	
	String[] Jouer;
	String[] Arbitrer;
	String[] Entrainer;
	
}
