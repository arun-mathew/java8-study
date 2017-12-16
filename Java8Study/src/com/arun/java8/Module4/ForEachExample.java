package com.arun.java8.Module4;

import java.util.Arrays;
import java.util.List;

import com.arun.java8.module1.Person;

public class ForEachExample {
	
	public static void main(String [] arg) {
		
		List<Person> persons = Arrays.asList(
				new Person("arun","mathew", 28),
				new Person("neethu","mathew", 30),
				new Person("ancy","mathew", 54),
				new Person("mathew","mathew", 58),
				new Person("rayan","aneesh", 2)
				);
		
		System.out.println("for loop");
		for(int i =0; i< persons.size(); i++) {
			System.out.println(persons.get(i));
		}
		System.out.println("for in loop ");
		for(Person p : persons) {
			System.out.println(p);
		}
		System.out.println("for each loop using lambda expression ");
		persons.forEach(p -> System.out.println(p));
		System.out.println("for each loop using method referance");
		persons.forEach(System.out::println);
	}

}
