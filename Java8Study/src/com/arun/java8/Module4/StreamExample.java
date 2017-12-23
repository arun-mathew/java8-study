package com.arun.java8.Module4;

import java.util.Arrays;
import java.util.List;

import com.arun.java8.module1.Person;

public class StreamExample {

	public static void main(String [] arg) {
		List<Person> persons = Arrays.asList(
				new Person("arun","mathew", 28),
				new Person("neethu","mathew", 30),
				new Person("ancy","mathew", 54),
				new Person("mathew","mathew", 58),
				new Person("rayan","aneesh", 2)
				);
		persons.stream()
				.filter(p -> p.getFirstName().startsWith("a"))
				.map(Person::getFirstName)
				.forEach(System.out::println);

	}

}
