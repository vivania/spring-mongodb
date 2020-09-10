package com.mongodb.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.api.model.Seance;

public interface SeanceRepository extends MongoRepository<Seance, Long> {

	List<Seance> findAll();
}
