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
//		��һ���ı��ļ��ϴ�����������   �ϴ��ɹ����� ���ϴ��ɹ���
//		1.����socket������
		Socket s = new Socket("192.168.1.17",10005);
//		��ȡ�ı��ļ�
		InputStream in = s.getInputStream();
		BufferedReader buin = 
				new BufferedReader(new FileReader("up.txt"));
		
//		����һ����������д�����ݵĶ���
		PrintWriter pr = new PrintWriter(s.getOutputStream(),true);
		String line = null;
		while((line = buin.readLine())!=null) {
			pr.println(line);
			
		}
		s.shutdownOutput();
		
//		��ȡ���������ص��ź�
		BufferedReader buf = 
				new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = buf.readLine();				
		System.out.println(str);
		
		buin.close();
		s.close();
		
		}
		
		

}



