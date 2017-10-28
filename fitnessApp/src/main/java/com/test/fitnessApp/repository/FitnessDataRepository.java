package com.test.fitnessApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.test.fitnessApp.dto.FitnessData;

@Repository
public interface FitnessDataRepository extends MongoRepository<FitnessData, String> {

	public FitnessData findByPersonPersonName(String personName);
	
	public FitnessData findByDate(String date);
}
