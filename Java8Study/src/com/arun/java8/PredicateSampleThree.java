package com.arun.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSampleThree {

	public static void main(String[] args) {
			List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
			
			System.out.println(values.stream()
										.filter(StreamOne::isGreater)
										.filter(StreamOne::isDivisible)
										.map(StreamOne::operation)
										.findAny()
										.get()
					
					);
			
			Predicate<Integer> greaterThanThree = number -> number > 3 ;
			
			Predicate<Integer> divisibleByTwo = number -> number%2 == 0;
			
			System.out.println(values.stream()
										.filter(greaterThanThree)
										.filter(divisibleByTwo)
										.mapToInt(number -> operation(number))
										.findAny()
										.getAsInt());
			
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
