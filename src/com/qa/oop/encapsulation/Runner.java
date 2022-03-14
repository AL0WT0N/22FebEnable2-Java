package com.qa.oop.encapsulation;

public class Runner {

	public static void main(String[] args) {
		
		Person anoush = new Person("Anoush", "Lowton", 28);
		Person denzel = new Person("Denzel", "Eggerue", 25);
		Person jonah = new Person(null, null, 0);
		
		// How many people are there?
//		System.out.println(Person.count);
		
		System.out.println(anoush.getAge());
		anoush.setAge(99);
		System.out.println(anoush.getAge());
		
		System.out.println(anoush);
		System.out.println(denzel);
		System.out.println(jonah);
	}
}
