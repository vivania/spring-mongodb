package com.mongodb.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.api.model.Sportifs;
import com.mongodb.api.repository.SportifsRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ControllerSportifs {
	
	@Autowired
	private SportifsRepository SportRepository;

	@RequestMapping(value = "/allSports", method = RequestMethod.GET)
	public List<Sportifs> getAllSportifs(){
		return SportRepository.findAll();
	}
	
	/*
	 * @RequestMapping(value = "/sportId", method = RequestMethod.GET) public
	 * Sportifs getSportById(@PathVariable int id){ return null; }
	 */
}
