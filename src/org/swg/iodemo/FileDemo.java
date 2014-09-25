package org.swg.iodemo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Path path = Paths.get("E:\\Ex\\Java\\MountainBike.java");
		Path path2 = Paths.get("E:\\Ex\\Java\\MountainBike.txt");
		Path path3 = Paths.get("E:\\Ex\\Java\\Sun.txt");
		
		System.out.println(path.toString()+":"+Files.notExists(path));
		
		byte[] fileArray = Files.readAllBytes(path);//读取小的文件
		
		Files.write(path2, fileArray);
		
		Charset charset = Charset.forName("utf8");
		
		String s = "Hello world \r\n我爱你中国";
		try( BufferedWriter writer = Files.newBufferedWriter(path3, charset)){
			writer.write(s, 0, s.length());
		}catch(IOException x){
			System.err.format("IOException: %s%n", x);
		}
		
	}
}
