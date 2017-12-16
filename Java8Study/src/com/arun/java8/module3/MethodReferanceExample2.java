package com.arun.java8.module3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.arun.java8.module1.Person;

public class MethodReferanceExample2 {

	public static void main(String [] arg) {
		List<Person> persons = Arrays.asList(
				new Person("arun","mathew", 28),
				new Person("neethu","mathew", 30),
				new Person("ancy","mathew", 54),
				new Person("mathew","mathew", 58),
				new Person("rayan","aneesh", 2)
				);
		
		//Create a method to print all the elements in the list//
		printConditionaly(persons, p -> true, System.out::println);
		
	}

	private static void printConditionaly(List<Person> persons, Predicate<Person> condition, Consumer<Person> consumer) {

		System.out.println("Within printConditionaly");
		for(Person p : persons) {
			if(condition.test(p)) {
				consumer.accept(p);
			}
		}

	}

}
