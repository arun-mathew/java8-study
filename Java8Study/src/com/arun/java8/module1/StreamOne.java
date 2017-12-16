package com.arun.java8.module1;

import java.util.Arrays;
import java.util.List;

public class StreamOne {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println(values.stream()
									.filter(x -> x > 3)
									.filter(x -> x % 2 == 0)
									.map(x -> x*2)
									.findFirst()
									.get()
				);
		System.out.println(values.stream()
									.filter(StreamOne::isGreater)
									.filter(StreamOne::isDivisible)
									.map(StreamOne::operation)
									.findAny()
									.get()
				
				);
	}
		
	public static boolean isGreater(int number)
	{
		return number > 3;
	}
	
	public static boolean isDivisible(int number)
	{
		return number % 2 == 0;
	}
	
	public static int operation(int number)
	{
		return number*2;
	}

}
