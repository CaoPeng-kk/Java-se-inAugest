package augest.week2.net.upload.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerUploadDemo {

	public static void main(String[] args) throws IOException {
		ServerSocket so = new ServerSocket(10005);
		Socket sop = so.accept();
		System.out.println(sop.getInetAddress()+"...connected");
//		������ȡ����ȡ�ͻ��˷������ļ�
		BufferedReader buf = 
				new BufferedReader(new InputStreamReader(sop.getInputStream()));
//		����һ��д���� ���ļ�д��Ӳ����
		BufferedWriter bw = new BufferedWriter(new FileWriter(".\\server.txt"));
		
		String line = null;
		
		while((line = buf.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
			
		}
		
		
		
//		����һ����ӡ��  ���߿ͻ��� �ϴ��ɹ���
		PrintWriter pr = new PrintWriter(sop.getOutputStream(),true);
		pr.println("�ϴ��ɹ�");
		
		bw.close();
		sop.close();
		so.close();
	
	
	
	
	
	}

}
