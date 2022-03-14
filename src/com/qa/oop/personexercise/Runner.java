package com.qa.oop.personexercise;

public class Runner {

	public static void main(String[] args) {
		Person a = new Person("Tom", "Developer", 45);
		Person b = new Person("Dick", "Builder", 25);
		Person c = new Person("Harry", "Nurse", 36);
		
		PersonManager pm = new PersonManager();
		pm.addPerson(a);
		pm.addPerson(b);
		pm.addPerson(c);
		
		pm.search("Tom");
		pm.printAll();
		
//		pm.printAllWithStream();
		
	}	
}