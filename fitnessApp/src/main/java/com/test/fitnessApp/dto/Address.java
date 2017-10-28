package com.test.fitnessApp.dto;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Address {

	private String country;
	private String pincode;
	private String state;
	private String city;
	private String longitude;
	private String latitude;
	
	public Address(){
		
	}
	
	public Address(String country, String pincode, String state, String city, String longitude, String latitude) {
		super();
		this.country = country;
		this.pincode = pincode;
		this.state = state;
		this.city = city;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	
}
