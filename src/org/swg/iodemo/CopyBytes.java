package org.swg.iodemo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyBytes {
	
	public static void main(String[] args){
		
		FileInputStream in = null;//如果不是亲自写一遍，我不知道，这里必须要，否则之后finally中关不掉。
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("Spring.txt");//java.io.FileNotFoundException: Spring.txt (系统找不到指定的文件。)
			out = new FileOutputStream("Spring2.txt");
			
			int c;//如果不是亲自写一遍，我不知道，不能在while 中写 while(int c = in.read())
			int i = 0;
			while((c = in.read()) != -1){
				out.write(c);
				System.out.format("%d c: %d%n",++i,c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{//如果不亲自写一遍，我不知道，finally 里面也还是要try catch的。
			
			if(in != null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				in = null;
			}
			if(out != null){
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
