package com.rabindra.multithreading.usingLambda;

public class MultithreadingPractice {

	public static void main(String [] args) {
	
		
		//IN CASE OF THIS PARTICULAR EXAMPLE SINCE WE'VE USED objects i.e obj1 AND obj2 ONLY ONCE IN OUR
		//INTIRE CODE SO WE COULD JUST CUT/PASTE object's values directly to obj parameter of thread.
//		Runnable obj1 = () ->
//		{
//			
//			for(int i=1; i<=3; i++) {
//				System.out.println("Hello");
//				
//				try{
//					Thread.sleep(1000);
//				}catch(Exception e) {
//					
//				}
//			}
//		}
//	;				
//		Runnable obj2 = () ->
//			 {
//				
//				for(int i=1; i<=3; i++) {
//					System.out.println("Hi");
//					
//					try{
//						Thread.sleep(1000);
//					}catch(Exception e) {
//						
//					}
//				}
//			}
//		;

		Thread t1 = new Thread(() ->
		{
			
			for(int i=1; i<=3; i++) {
				System.out.println("Hello");
				
				try{
					Thread.sleep(1000);
				}catch(Exception e) {
					
				}
			}
		});
		Thread t2 = new Thread( () ->
		 {
				
			for(int i=1; i<=3; i++) {
				System.out.println("Hi");
				
				try{
					Thread.sleep(1000);
				}catch(Exception e) {
					
				}
			}
		});
		
		t1.start();
		
		try{
			Thread.sleep(10);
		}catch(Exception e) {
			
		}
		
		t2.start();
	}
}
	
	

