package augest.week2.net.upload.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClientUploadDemo {

	public static void main(String[] args) throws IOException {
//		将一个文本文件上传到服务器端   上传成功返回 “上传成功”
//		1.创建socket流对象
		Socket s = new Socket("192.168.1.17",10005);
//		读取文本文件
		InputStream in = s.getInputStream();
		BufferedReader buin = 
				new BufferedReader(new FileReader("up.txt"));
		
//		创建一个往服务器写入数据的对象
		PrintWriter pr = new PrintWriter(s.getOutputStream(),true);
		String line = null;
		while((line = buin.readLine())!=null) {
			pr.println(line);
			
		}
		s.shutdownOutput();
		
//		读取服务器发回的信号
		BufferedReader buf = 
				new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = buf.readLine();				
		System.out.println(str);
		
		buin.close();
		s.close();
		
		}
		
		

}



