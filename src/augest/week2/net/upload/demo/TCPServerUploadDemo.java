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
//		创建读取流读取客户端发来的文件
		BufferedReader buf = 
				new BufferedReader(new InputStreamReader(sop.getInputStream()));
//		创建一个写入流 将文件写到硬盘上
		BufferedWriter bw = new BufferedWriter(new FileWriter(".\\server.txt"));
		
		String line = null;
		
		while((line = buf.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
			
		}
		
		
		
//		创建一个打印流  告诉客户端 上传成功；
		PrintWriter pr = new PrintWriter(sop.getOutputStream(),true);
		pr.println("上传成功");
		
		bw.close();
		sop.close();
		so.close();
	
	
	
	
	
	}

}
