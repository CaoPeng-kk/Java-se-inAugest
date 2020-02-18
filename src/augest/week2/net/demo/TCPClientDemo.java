package augest.week2.net.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("192.168.1.17",10002);
		OutputStream out = s.getOutputStream();
		out.write("我是客户端".getBytes());
		
		InputStream iu = s.getInputStream();
		byte[] b = new byte[1024];
		int len = iu.read(b);
		String str = new String(b,0,len);
		System.out.println(str);
		
		
		s.close();
		
		
		
		
	}

}
