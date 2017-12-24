package com.arun.functionalPrograming;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
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
		
		//Imperative style of programiming
		//mutability
		//Telling the code , how to do//
		//more error prone//
		
//		for(int i = 2; i< number; i++) {
//			if(number % i == 0)
//				return false;			
//		}
//		
//		return number > 1 ;
		
		//Declerative style of programming//
		//immutable
		//Telling waht to do and let the code work on //
		
	    return number > 1 && IntStream.range(2, number)
	    							  .noneMatch(index -> number % index == 0);
		
	}

}
