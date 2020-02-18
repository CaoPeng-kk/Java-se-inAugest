package augest.week2.net.demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSendDemo {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();
		String s = "´«Êä";
		byte[] b =s.getBytes();		
		DatagramPacket dp = new DatagramPacket(b, b.length,InetAddress.getByName("192.168.1.17"),10000);
		ds.send(dp);
		ds.close();
		
	}

}
