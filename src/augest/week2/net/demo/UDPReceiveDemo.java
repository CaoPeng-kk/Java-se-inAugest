package augest.week2.net.demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceiveDemo {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(10000);
//		创建接受数据包
		byte[] b = new byte[1024];
		
		DatagramPacket dp = new DatagramPacket(b, b.length);
//		用接收方法将数据存储到数据包中
		ds.receive(dp);
		InetAddress ip = dp.getAddress();
		String s = ip.getHostAddress();
		int port = dp.getPort();
		String text = new String(dp.getData(),0,dp.getLength());
		System.out.println(ip+" "+s+" "+port+""+text+""+"");
		
		
		
		
		
		
	}

}
