package com.arun.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StrategyInjectionFour {
	
	public static int totalValues(List<Integer> values, Predicate<Integer> strategy)
	{
		return values.stream()
		.filter(strategy)
		.reduce(0, Math::addExact);
	}

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println(totalValues(values, x-> true));
		System.out.println(totalValues(values, x-> x%2 == 0));

	}

}
