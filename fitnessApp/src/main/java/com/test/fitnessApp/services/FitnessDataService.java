package com.test.fitnessApp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.fitnessApp.dto.FitnessData;
import com.test.fitnessApp.repository.FitnessDataRepository;

@Service
public class FitnessDataService {
	
	@Autowired
	FitnessDataRepository fitnessDataPepository;
	
	public void addFitnessData(FitnessData fitnessData) {
		fitnessDataPepository.save(fitnessData);	
	}

	public FitnessData getFitnessDataByPersonName(String personName) {
		return fitnessDataPepository.findByPersonPersonName(personName);
		
	}

	public List<FitnessData> getAllFitnessData() {
		List<FitnessData> fitnessData = new ArrayList<FitnessData>();
		fitnessDataPepository.findAll().forEach(fitnessData::add);
		return fitnessData;
	}

	public FitnessData getFitnessDataByDate(String date) {
		return fitnessDataPepository.findByDate(date);
	}

}
