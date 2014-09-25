package org.swg.iodemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacter {
	
	public static void main(String[] args) {
		
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		
		try {
			fileReader = new FileReader("Summer.txt");
			fileWriter = new FileWriter("Summer2.txt");
			int c;// the int variable holds a character value in its last 16 bits
			while((c = fileReader.read()) != -1){
				System.out.println(c);
				fileWriter.write(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			
			if(fileReader != null){
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				fileReader = null;
			}
			if(fileWriter != null){
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				fileWriter = null;
			}
		}
	}

}
