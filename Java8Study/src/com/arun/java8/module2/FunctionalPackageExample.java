package com.arun.java8.module2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import com.arun.java8.module1.Person;

public class FunctionalPackageExample {
	
	public static void main(String [] arg) {
		List<Person> persons = Arrays.asList(
				new Person("arun","mathew", 28),
				new Person("neethu","mathew", 30),
				new Person("ancy","mathew", 54),
				new Person("mathew","mathew", 58),
				new Person("rayan","aneesh", 2)
				);
		//Sort the list by last name//
		Collections.sort(persons, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));


		//Create a method to print all the elements in the list//
		printConditionaly(persons, p -> true);

	
		//Create a method which accepts list and condition based on that condition print the list//
		printConditionaly(persons, p -> p.getLastName().startsWith("m"));

	}

	private static void printConditionaly(List<Person> persons, Predicate<Person> predicate) {

		System.out.println("Within printConditionaly");
		for(Person p : persons) {
			if(predicate.test(p)) {
				System.out.println(p);
			}
		}

	}


}
