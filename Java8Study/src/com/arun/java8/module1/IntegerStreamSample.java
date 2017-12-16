package com.arun.java8.module1;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class IntegerStreamSample {

	public static void main(String[] args) {
		
		System.out.println(isPrime(1));
		System.out.println(isPrime(56));
		System.out.println(isPrime(13));
		System.out.println(isPrime(13));
		System.out.println(isPrime(115));
		System.out.println(isPrime(7));
	}
	
	public static boolean isPrime(int number)
	{
		return number > 1 &
				IntStream.range(2, number)
				.noneMatch(index -> number % index == 0);
				
	}
	
	/*public static boolean isPrime2(int number)
	{
	    Predicate<Integer> isDivisible = divisor -> number % divisor == 0;
		
		return number > 1 &
				IntStream.range(2, number)
				.noneMatch(index -> isDivisible(index));
				
	}*/

}
