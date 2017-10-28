package com.test.fitnessApp.dto;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Events {

	private String eventDate;
	private String eventName;
	private Address eventLocation;
	private String eventDescription;
	
	public Events(){
		
	}
	
	public Events(String eventDate, String eventName, Address eventLocation, String eventDescription) {
		super();
		this.eventDate = eventDate;
		this.eventName = eventName;
		this.eventLocation = eventLocation;
		this.eventDescription = eventDescription;
	}
	
	public String getEventDate() {
		return eventDate;
	}
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public Address getEventLocation() {
		return eventLocation;
	}
	public void setEventLocation(Address eventLocation) {
		this.eventLocation = eventLocation;
	}
	public String getEventDescription() {
		return eventDescription;
	}
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	
	
}
