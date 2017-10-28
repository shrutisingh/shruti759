package com.test.fitnessApp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.test.fitnessApp.dto.Events;

@Repository
public interface FitnessEventRepository extends MongoRepository<Events, String>{

	public List<Events> findByEventDate(String date);
	
	public List<Events> findByEventLocationCity(String date);
}
