package com.qa.oop.personexercise;

public class Person {
	
	private String name;
	private String jobTitle;
	private int age;
	
	public Person (String name, String jobTitle, int age) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getJob() {
		return this.jobTitle;
	}
	
	public void setJob(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("This person's name is: %s%nTheir age is: %s%nTheir job title is: %s", this.name, this.age, this.jobTitle);
	}
}
