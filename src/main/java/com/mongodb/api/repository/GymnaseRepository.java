package com.mongodb.api.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import com.mongodb.api.model.Gymnases;

@Repository
public interface GymnaseRepository extends MongoRepository<Gymnases, Long>{

	List<Gymnases> findAll();
	
	List<Gymnases> findByIdGymnase(int IdGymnase);
	
	List<Gymnases> findGymnaseByVille(String ville);
	
	//List<Gymnases> findBySeance(String sceance);
	
	
}
