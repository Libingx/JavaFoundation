package org.swg.iodemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * Programming I/O often involves translating 
 * to and from the neatly formatted data 
 * humans like to work with.
 * Objects of type Scanner are useful for 
 * breaking down formatted input into tokens 
 * and translating individual tokens 
 * according to their data type
 * White space characters 
 * include blanks, tabs, and line terminators
 * Scanner also supports tokens 
 * for all of the Java language's primitive types
 *  (except for char), 
 *  as well as BigInteger and BigDecimal. 
 */
public class ScannerDemo {

	public static void main(String[] args) throws IOException {
		Scanner s = null;
		Scanner ss = null;
		try {
			s = new Scanner(new BufferedReader(new FileReader("Spring.txt")));
			ss = new Scanner(new BufferedReader(new FileReader("Spring2.txt")));
			s.useDelimiter(",\\s*");
			while (s.hasNext()) {
				System.out.println(s.next());
			}
			while(ss.hasNext()){
				
				System.out.println(ss.nextDouble());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			if( s != null){
				s.close();
				s = null;
			}
		}

	}

}
