package augest.week2.net.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP_ClientTransDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("192.168.1.17",10002);
		BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
//		录入键盘数据    输入字母数据 发送给服务器   服务器收到后   打印在控制台  并将字母转为大写后返回给客户端
//		源 ；键盘录入  ，目的；服务器端   ；；；都是纯文本数据
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
//		接受服务器端返回的数据
		BufferedReader bufin = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String line = null;
		while((line = bu.readLine())!=null) {
			if("over".equals(line))
				break;
			out.println(line);
			String dtr = bufin.readLine();
			System.out.println(dtr);
			
			
		}
		s.close();
		
		
		
		
		
		
		
		
		
	}

}
