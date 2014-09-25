package org.swg.concurrencydemo;
/*
 * Each thread is associated 
 * with an instance of the class Thread.
 *  There are two basic strategies 
 *  for using Thread objects 
 *  to create a concurrent application.
 */
public class HelloRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello Runable...");
	}
	
	public static void main(String[] args){
		
		(new Thread(new HelloRunnable())).start();
		
	}

}
