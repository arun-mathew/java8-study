package com.arun.java8.module1;

public class RunnableExample {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello from Runnable");				
			}
			
		});
		thread.run();
		
		Thread lambdaThread = new Thread(() -> System.out.println("Hello from lambda thread"));
		
		lambdaThread.run();
	}

}
