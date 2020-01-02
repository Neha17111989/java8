package com.altimetrik;

public class LamdaExpressionThreadCreation {

	static public void m1() {
		for(int i=0;i<5 ;i++) {
			System.out.println("Child Thread : "+i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		/*
		 * Runnable r=()->{ for(int i=0;i<5 ;i++) {
		 * System.out.println("Child Thread : "+i); } };
		 */
		/*
		 * Object obj; Streams s; Iterable it;
		 */
		Runnable r=LamdaExpressionThreadCreation::m1;
		Thread t=new Thread(r);
		t.start();
		//t.join();
		for(int i=0;i<5 ;i++) {
			System.out.println("Main Thread : "+i);
		}
		Thread.currentThread().join();
	}
}
