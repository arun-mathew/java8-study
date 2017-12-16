package com.arun.java8.module3;

public class MethodReferanceExample {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Runnable() {  //Anonymous inner class for Runnable interface//
			@Override
			public void run() {
				print();				
			}
		});
		thread1.run();
		
		Thread thread2 = new Thread(() -> print());  //Lambda equivalent for anonymous inner class 
		thread2.run();
		
		Thread thread3 = new Thread(MethodReferanceExample::print);  // ==> () -> print()  method reference alternative for lambda expression
		thread3.run();

	}
	
	public static void print() {
		System.out.println("Hello Arun");
	}

}
