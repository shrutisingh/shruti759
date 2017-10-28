package com.test.fitnessApp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.test.fitnessApp.dto.Person;

@Repository
public interface FitnessCoachRepository extends MongoRepository<Person, String>{

	@Query(value="{address.city:?0} && {isCoach:?1}")
	public List<Person> findByCity(String city, String isCoach);
	
	@Query(value="{isCoach:?0}")
	public List<Person> getAllFitnessCoach(String isCoach);
	
	public List<Person> findBySpecialization(String specialization);
	
}
