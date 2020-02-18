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
//		¼���������    ������ĸ���� ���͸�������   �������յ���   ��ӡ�ڿ���̨  ������ĸתΪ��д�󷵻ظ��ͻ���
//		Դ ������¼��  ��Ŀ�ģ���������   ���������Ǵ��ı�����
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
//		���ܷ������˷��ص�����
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
