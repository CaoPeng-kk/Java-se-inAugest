package augest.week2.net.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerDemo {

	public static void main(String[] args) throws IOException {
		ServerSocket so = new ServerSocket(9090);
		Socket s = so.accept();
		byte[] b = new byte[1024];
		InputStream in = s.getInputStream();
		int len = in.read(b);
		String str = new String(b,0,len);
		System.out.println(" ’µΩ"+str);
		
		
//		OutputStream out = s.getOutputStream();
//		out.write("∑µªÿdata".getBytes());
		PrintWriter pr = new PrintWriter(s.getOutputStream(),true);
		pr.println("hello world !");
		
		
		
		
		
		s.close();
		so.close();
		
		
		
		
	}

}
