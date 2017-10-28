package com.test.fitnessApp.dto;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person {
	private String personName;
	private String age;
	private String sex;
	private String phoneNo;
	private String mailId;
	private String isCoach;
	private String specialization;
	private Address address;
	
	public Person(){
		
	}
	
	public Person(String personName, String age, String sex, String phoneNo, String mailId, String isCoach,
			String specialization, Address address) {
		super();
		this.personName = personName;
		this.age = age;
		this.sex = sex;
		this.phoneNo = phoneNo;
		this.mailId = mailId;
		this.isCoach = isCoach;
		this.specialization = specialization;
		this.address = address;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getIsCoach() {
		return isCoach;
	}
	public void setIsCoach(String isCoach) {
		this.isCoach = isCoach;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
