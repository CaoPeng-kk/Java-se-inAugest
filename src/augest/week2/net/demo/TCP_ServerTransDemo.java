package augest.week2.net.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class TCP_ServerTransDemo {

	public static void main(String[] args) throws IOException {
		ServerSocket so = new ServerSocket(10002);
		Socket s = so.accept();
		BufferedReader bufin = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter prout = new PrintWriter(s.getOutputStream(),true);
		String line = null;
		while((line = bufin.readLine())!= null) {
			System.out.println(line);
			prout.println(line.toUpperCase());
			
			
		}
		s.close();
		so.close();
		
		
//		读取客户端发来的数据并打印在控制台上   源 socket  ；；目的  控制台
		
		
		
	
		
		
		
		
		
		
	}	

}
