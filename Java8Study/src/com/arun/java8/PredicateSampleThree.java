package com.arun.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateSampleThree {

	public static void main(String[] args) {
			List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
						
			Predicate<Integer> greaterThanThree = number -> number > 3 ;
			
			Predicate<Integer> divisibleByTwo = number -> number%2 == 0;
			
			//Another approach using predicate //
			System.out.println(values.stream()
										.filter(greaterThanThree)
										.filter(divisibleByTwo)
										.mapToInt(number -> operation(number))
										.findAny()
										.getAsInt());
			//Get an integer pivot value and return an integer predicate // 
			Function<Integer, Predicate<Integer>> isGreaterThan = pivot -> number -> number > pivot;
			
			//Yet another level from predicate using Function which return a predicate //
			System.out.println(values.stream()
										.filter(isGreaterThan.apply(5))
										.filter(divisibleByTwo)
										.mapToInt(number -> operation(number))
										.findFirst()
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
