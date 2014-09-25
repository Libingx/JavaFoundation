package org.swg.concurrencydemo;

public class SampleThread {
	
	//Display messages, preceded by 
	//the name of the current thread
	static void threadMessage(String message){
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName+message);
	}
	
	//create a thread
	
	private class MessageLoop implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			String[] strsInfo = {"Huntsman keeps all",
					"Wolf eat all ",
					"Wolf will eat all except huntsman",
					"Man will kill cats and women will kill dogs"};
			for (int i = 0; i < strsInfo.length; i++) {
				//Pause for 4 seconds
				try {
					Thread.sleep(4000);
					//Print a message
					threadMessage(strsInfo[i]);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					threadMessage("I wasn't Done!");
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		//Delay, in milliseconds before
		//we interrupt MessageLoop
		//thread(default one hour)
		long patience = 1000*60*60;
		
		//If command line argument present, 
		//gives patience in seconds
		if(args.length > 0){
			try {
				patience = Long.parseLong(args[0])*1000;
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Argument must be an integer...");
			}
		}
	}

}
