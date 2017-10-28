package com.test.fitnessApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.fitnessApp.dto.FitnessData;
import com.test.fitnessApp.services.FitnessDataService;

@RestController
public class FitnessDataController {

	@Autowired
	FitnessDataService fitnessDataService;
	
	@RequestMapping(method=RequestMethod.POST, value="/fitness")
	public void addFitnessData(@RequestBody FitnessData fitnessData){
		fitnessDataService.addFitnessData(fitnessData);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/fitness/personName/{personName}")
	public FitnessData getFitnessDataByPersonName(@PathVariable String personName){
		return fitnessDataService.getFitnessDataByPersonName(personName);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/fitness")
	public List<FitnessData> getAllFitnessData(){
		return fitnessDataService.getAllFitnessData();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/fitness/{date}")
	public FitnessData getFitnessDataByDate(@PathVariable String date){
		return fitnessDataService.getFitnessDataByDate(date);
	}
}
