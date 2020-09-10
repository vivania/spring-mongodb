package com.mongodb.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.api.model.Seance;
import com.mongodb.api.repository.SeanceRepository;

//@RestController("/api")
public class ConstructeurSecance {
	
	@Autowired
	private SeanceRepository seanceRepository;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Seance> getAllGymnase(){
		return seanceRepository.findAll();
	}
}
