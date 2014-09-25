package org.swg.iodemo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyBytes {
	
	public static void main(String[] args){
		
		FileInputStream in = null;//�����������дһ�飬�Ҳ�֪�����������Ҫ������֮��finally�йز�����
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("Spring.txt");//java.io.FileNotFoundException: Spring.txt (ϵͳ�Ҳ���ָ�����ļ���)
			out = new FileOutputStream("Spring2.txt");
			
			int c;//�����������дһ�飬�Ҳ�֪����������while ��д while(int c = in.read())
			int i = 0;
			while((c = in.read()) != -1){
				out.write(c);
				System.out.format("%d c: %d%n",++i,c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{//���������дһ�飬�Ҳ�֪����finally ����Ҳ����Ҫtry catch�ġ�
			
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
