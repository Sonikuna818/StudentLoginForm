package com.database.StudentLogin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="student")
public class Student 
{
	@Id
	private String id;
	private String name;
	private String email;
	private String city;
	private String country;
	private String age;
	private String gender;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public Student(String id, String name, String email, String city, String country, String age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.city = city;
		this.country = country;
		this.age = age;
		this.gender = gender;
	}
	
	
	
	
	
	
	
	
	

}
