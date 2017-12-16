package com.arun.java8.module2;

public class ThisReferanceInLambda {
		
	public static void main(String[] args) {
		
		int a = 10;
		int b = 30;
		
		ThisReferanceInLambda obj1 = new ThisReferanceInLambda();
		ThisReferanceInLambda obj2 = new ThisReferanceInLambda();
		obj1.doProcess(a, new Process() {

			@Override
			public void add(int i) {
				System.out.println("a+b:"+ (a+b));
				System.out.println(this);
				
			}
			
			public String toString() {
				return "This is anonymous inner class";
			}
			
		});
		
		obj2.doProcess(a, i -> { System.out.println("a+b :"+(a+b) ); 
							//	System.out.println(this);
		} );
		
		obj2.execute(a);

	}
	
	private void execute(int a) {
		doProcess(a, i -> { 
			System.out.println("a+b"+(a+i));
			System.out.println(this);
			
		});
	}

	private  void doProcess(int a, Process process) {

		process.add(a);
	}
	
	public String toString() {
		return "This is the main class object";
	}

}
