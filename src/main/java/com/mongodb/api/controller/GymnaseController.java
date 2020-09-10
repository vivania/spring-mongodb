package com.mongodb.api.controller;

import java.util.ArrayList;
import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.mongodb.api.model.Gymnases;
import com.mongodb.api.repository.GymnaseRepository;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class GymnaseController {

	
	@Autowired
	private GymnaseRepository gymnaseRepository ;
	
	
	@RequestMapping(value = "/gymnases", method = RequestMethod.GET)
	public List<Gymnases> getAllGymnase(){
		return gymnaseRepository.findAll();
	}
	
	@RequestMapping(value = "/IdGymnase/{IdGymnase}", method = RequestMethod.GET)
	public List<Gymnases> getGymnases(@PathVariable("IdGymnase") int IdGymnase) {
		return gymnaseRepository.findByIdGymnase(IdGymnase);
	}
	
	@RequestMapping(value="/ville/{ville}", method = RequestMethod.GET)
	public List<Gymnases> getVile(@PathVariable String ville){
		return  gymnaseRepository.findGymnaseByVille(ville);
	}
	
	/*
	 * @RequestMapping(value = "seances/{seances}" , method = RequestMethod.GET)
	 * public List<Gymnases> getSceances(@PathVariable String seance){
	 * 
	 * 
	 * }
	 */
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Gymnases addNewGymnases(@RequestBody Gymnases gymnases) {
		return gymnaseRepository.save(gymnases);
	}
	 	
}
