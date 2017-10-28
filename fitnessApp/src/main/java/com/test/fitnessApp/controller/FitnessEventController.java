package com.test.fitnessApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.fitnessApp.dto.Events;
import com.test.fitnessApp.dto.FitnessData;
import com.test.fitnessApp.services.FitnessEventService;

@RestController
public class FitnessEventController {

	@Autowired
	FitnessEventService fitnessEventService;
	
	@RequestMapping(method=RequestMethod.POST, value="/events")
	public void addFitnessEvents(@RequestBody Events events){
		fitnessEventService.addFitnessEvents(events);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/events")
	public List<Events> getAllFitnessEvents(){
		return fitnessEventService.getAllFitnessEvents();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/events/{date}")
	public List<Events> getFitnessEventsByDate(@PathVariable String date){
		return fitnessEventService.getFitnessEventsByDate(date);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/events/city/{cityName}")
	public List<Events> getFitnessEventsByCity(@PathVariable String cityName){
		return fitnessEventService.getFitnessEventsByCity(cityName);
	}
}
