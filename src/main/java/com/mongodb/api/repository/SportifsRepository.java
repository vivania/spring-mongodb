package com.mongodb.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongodb.api.model.Sportifs;

@Repository
public interface SportifsRepository extends MongoRepository<Sportifs, Long> {

	List<Sportifs> findAll();
	List<Sportifs> findByIdSportifConseiller(int id);
	List<Sportifs> findBySports(String sport);
	//Optional<Sportifs> 
	
}
