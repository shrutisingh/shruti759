package com.test.fitnessApp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.fitnessApp.dto.Events;
import com.test.fitnessApp.repository.FitnessEventRepository;

@Service		
public class FitnessEventService {

	@Autowired
	FitnessEventRepository fitnessEventPepository;
	
	public void addFitnessEvents(Events fitnessData) {
		fitnessEventPepository.save(fitnessData);	
	}	

	public List<Events> getAllFitnessEvents() {
		List<Events> events = new ArrayList<Events>();
		fitnessEventPepository.findAll().forEach(events::add);
		return events;
	}
	
	public List<Events> getFitnessEventsByDate(String date) {
		return fitnessEventPepository.findByEventDate(date);
	}

	public List<Events> getFitnessEventsByCity(String cityName) {
		return fitnessEventPepository.findByEventLocationCity(cityName);
	}
}
