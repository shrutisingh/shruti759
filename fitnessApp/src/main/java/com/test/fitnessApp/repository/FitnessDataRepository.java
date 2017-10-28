package com.test.fitnessApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.test.fitnessApp.dto.FitnessData;

public interface FitnessDataRepository extends MongoRepository<FitnessData, String> {

	public FitnessData findByPersonPersonName(String personName);
	
	public FitnessData findByDate(String date);
}
