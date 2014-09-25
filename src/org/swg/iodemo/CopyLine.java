package org.swg.iodemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLine {

	public static void main(String[] args)  {

		BufferedReader inputReader = null;
		PrintWriter outWriter = null;

		try {
			inputReader = new BufferedReader(new FileReader("Spring.txt"));
			outWriter = new PrintWriter(new FileWriter("Spring3.txt"));

			String line;
			while ((line = inputReader.readLine()) != null) {
				System.out.println(line);
				outWriter.write(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (inputReader != null) {
				try {
					inputReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				inputReader = null;
			}
			if (outWriter != null) {
				outWriter.close();
				outWriter = null;
			}
		}
	}

}
