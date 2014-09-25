package org.swg.concurrencydemo;

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
