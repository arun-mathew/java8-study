package com.arun.java8.module2;

public class LambdaClosure {
	
	public static void main(String [] arg) {
		
		int a = 10;
		int b = 20;
		
		doProcess(a, i -> System.out.println( i + b));
		
	}

	private static void doProcess(int a, Process process) {
		
		process.add(a);
	}
}

interface Process{
	
	public void add(int i);
}
