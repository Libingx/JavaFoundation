package org.swg.concurrencydemo;

public class HelloThread extends Thread {
	
	public void run(){
		
		System.out.println("Hello Thread...");
	}

	public static void main(String[] args){
		
		(new HelloThread()).start();
		
	}
}
