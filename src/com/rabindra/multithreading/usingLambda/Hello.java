package com.rabindra.multithreading.usingLambda;

public class Hello implements Runnable{

	public void run() {
		
		for(int i=1; i<=3; i++) {
			System.out.println("Hello");
			
			try{
				Thread.sleep(1000);
			}catch(Exception exc) {
				
			}
		}
	}
}
