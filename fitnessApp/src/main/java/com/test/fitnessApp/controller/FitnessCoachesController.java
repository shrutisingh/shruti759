package com.test.fitnessApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.fitnessApp.dto.FitnessData;
import com.test.fitnessApp.dto.Person;
import com.test.fitnessApp.services.FitnessCoachesService;

@RestController
public class FitnessCoachesController {

	@Autowired
	FitnessCoachesService fitnessCoachService;
	
	@RequestMapping(method=RequestMethod.POST, value="/coaches")
	public void addFitnessCoaches(@RequestBody Person coaches){
		fitnessCoachService.addFitnessCoaches(coaches);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/coaches/{cityName}/{isCoach}")
	public List<Person> getFitnessCoachByCity(@PathVariable(value="cityName") String cityName, @PathVariable(value="isCoach") String isCoach){
		return fitnessCoachService.getFitnessCoachByCity(cityName, isCoach);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/coaches")
	public List<Person> getAllFitnessCoach(){
		return fitnessCoachService.getAllFitnessCoach();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/coaches/{specialization}")
	public List<Person> getFitnessDataBySpecialization(@PathVariable String specialization){
		return fitnessCoachService.findFitnessCoachSpecialization(specialization);
	}
}
