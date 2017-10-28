package com.test.fitnessApp.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class FitnessData {
	
	@Id
	private String fitnessDataId;
	
	private String bloodPressure;
	private String pulseRate;
	private String date;
	private String steps;
	private String walking;
	private String running;
	private String calorieConsumption;
	private String weight;
	private String height;
	private String bodyMassIndex;
	private String calorieBurning;
	private Person person;
	public FitnessData(){
		
	}
	
	public FitnessData(Person person, String bloodPressure, String pulseRate, String date, String steps, String walking,
			String running, String calorieConsumption, String weight, String height, String bodyMassIndex,
			String calorieBurning, String fitnessDataId) {
		super();
		this.fitnessDataId = fitnessDataId;
		this.person = person;
		this.bloodPressure = bloodPressure;
		this.pulseRate = pulseRate;
		this.date = date;
		this.steps = steps;
		this.walking = walking;
		this.running = running;
		this.calorieConsumption = calorieConsumption;
		this.weight = weight;
		this.height = height;
		this.bodyMassIndex = bodyMassIndex;
		this.calorieBurning = calorieBurning;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getBloodPressure() {
		return bloodPressure;
	}
	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	public String getPulseRate() {
		return pulseRate;
	}
	public void setPulseRate(String pulseRate) {
		this.pulseRate = pulseRate;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSteps() {
		return steps;
	}
	public void setSteps(String steps) {
		this.steps = steps;
	}
	public String getWalking() {
		return walking;
	}
	public void setWalking(String walking) {
		this.walking = walking;
	}
	public String getRunning() {
		return running;
	}
	public void setRunning(String running) {
		this.running = running;
	}
	public String getCalorieConsumption() {
		return calorieConsumption;
	}
	public void setCalorieConsumption(String calorieConsumption) {
		this.calorieConsumption = calorieConsumption;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getBodyMassIndex() {
		return bodyMassIndex;
	}
	public void setBodyMassIndex(String bodyMassIndex) {
		this.bodyMassIndex = bodyMassIndex;
	}
	public String getCalorieBurning() {
		return calorieBurning;
	}
	public void setCalorieBurning(String calorieBurning) {
		this.calorieBurning = calorieBurning;
	}

	public String getFitnessDataId() {
		return fitnessDataId;
	}

	public void setFitnessDataId(String fitnessDataId) {
		this.fitnessDataId = fitnessDataId;
	}
}
