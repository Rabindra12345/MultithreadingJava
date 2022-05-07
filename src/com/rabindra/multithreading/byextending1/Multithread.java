package com.rabindra.multithreading.byextending1;

public class Multithread {

	public static void main(String[] args) throws InterruptedException {
		int n = 8; // Number of threads
//		Double positiveInf = Double.POSITIVE_INFINITY;
		
//		for (int i = 0; i < positiveInf; i++) {
		for (int i = 0; i < n; i++) {
			MultithreadingDemo object
				= new MultithreadingDemo();
			object.start();
			
		}

	}

}
