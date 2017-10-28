package com.test.fitnessApp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.fitnessApp.dto.Person;
import com.test.fitnessApp.repository.FitnessCoachRepository;

@Service
public class FitnessCoachesService {

	@Autowired
	FitnessCoachRepository fitnessCoachPepository;
	
	public void addFitnessCoaches(Person fitnessData) {
		fitnessCoachPepository.save(fitnessData);	
	}	

	public List<Person> getAllFitnessCoach() {
		//List<Person> coaches = new ArrayList<Person>();
		return fitnessCoachPepository.getAllFitnessCoach("yes");
		//return coaches;
	}
	
	public List<Person> findFitnessCoachSpecialization(String specialization) {
		return fitnessCoachPepository.findBySpecialization(specialization);
	}

	public List<Person> getFitnessCoachByCity(String cityName, String isCoach) {
		return fitnessCoachPepository.findByCity(cityName, isCoach);
	}
}
