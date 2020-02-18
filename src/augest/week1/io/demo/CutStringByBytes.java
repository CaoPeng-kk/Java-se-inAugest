package augest.week1.io.demo;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class CutStringByBytes {

	public static void main(String[] args) throws IOException {
		String str = "abc哈哈嘻嘻";
//		for(byte c :b) {
//			System.out.println(c);
//		}
		
		int len = str.getBytes("gbk").length;
		for(int s=0;s<=len;s++) {
			System.out.println("按"+s+"字节获取的字符串是"+cutByBytes(str, s));
			
		}
		String a = cutByBytes(str,9);
	}

	public static String cutByBytes(String str,int len) throws IOException {
		byte[] b = str.getBytes("gbk");
		int count =0;
		for(int x=len-1;x>=0;x--) {
			if(b[x]<0)
				count++;
			else
				break;
		}
		if(count%2==0)
			return new String(b,0,len,"gbk");
		else
			return new String(b,0,len-1,"gbk");
			
	}

}




