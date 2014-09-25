
package org.swg.concurrencydemo;
/*
 * This is an efficient means of
 * making processor time available to 
 * the other threads of an application or other applications 
 * that might be running on a computer system. 
 * The sleep method can also be used for pacing, 
 * as shown in the example that follows, 
 * and waiting for another thread with duties 
 * that are understood to have time requirements
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class SleepDemos {
	
	public static void main(String[] args) throws InterruptedException {
		
		String[] strsInfo = {"Mares eat oats","Does eat oats",
				"Little lambs eat ivy","A kid will eat ivy too"};
		for (int i = 0; i < strsInfo.length; i++) {
			//Pause for 4second
			Thread.sleep(4000);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(strsInfo[i]+": "+sdf.format(new Date()));
		}
	}

}
