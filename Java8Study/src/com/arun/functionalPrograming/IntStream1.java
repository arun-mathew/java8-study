package com.arun.functionalPrograming;

import java.util.stream.IntStream;

public class IntStream1 {

	public static void main(String[] args) {
		System.out.println(isPrime(1));
		System.out.println(isPrime(3));
		System.out.println(isPrime(8));
		System.out.println(isPrime(5));
		System.out.println(isPrime(7));
	}

	private static boolean isPrime(int number) {
		
//		for(int i = 2; i< number; i++) {
//			if(number % i == 0)
//				return false;			
//		}
//		
//		return number > 1 ;
	    return number > 1 && IntStream.range(2, number)
	    							  .noneMatch(index -> number % index == 0);
		
	}

}
