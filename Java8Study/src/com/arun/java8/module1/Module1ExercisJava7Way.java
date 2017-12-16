package com.arun.java8.module1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Module1ExercisJava7Way {

	public static void main(String [] arg) {
		List<Person> persons = Arrays.asList(
				new Person("arun","mathew", 28),
				new Person("neethu","mathew", 30),
				new Person("ancy","mathew", 54),
				new Person("mathew","mathew", 58),
				new Person("rayan","aneesh", 2)
				);
		//Sort the list by last name//
		Collections.sort(persons, new Comparator<Person>(){
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}		
		});


		//Create a method to print all the elements in the list//
		printAllPersons(persons);

		//Create a method that print all the persons whose last name ends with n//
		printAllPersonsWithLastNameN(persons);

		//Create a method which accepts list and condition based on that condition print the list//
		printConditionaly(persons, new Condition() {
			public boolean test(Person p) {
				return p.getLastName().startsWith("m");
			}
		});

	}

	private static void printConditionaly(List<Person> persons, Condition condition) {

		System.out.println("Within printConditionaly");
		for(Person p : persons) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}

	}

	private static void printAllPersonsWithLastNameN(List<Person> persons) {
		System.out.println("Within printAllPersonsWithLastNameN");
		for(Person p : persons) {
			if(p.getLastName().startsWith("m")) {
				System.out.println(p);
			}
		}

	}

	private static void printAllPersons(List<Person> persons) {
		System.out.println("Within printAllPersons");
		for(Person p : persons) {
			System.out.println(p);
		}
	}

}

interface Condition {
	public boolean test(Person p);
}
