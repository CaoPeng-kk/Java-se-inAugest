package augest.week3.regex.demo;

import java.util.TreeSet;

public class RegexDemo {

	public static void main(String[] args) {
//		replaceAll();
		
		
		
		ipSort();
			
				
	}

	public static void ipSort() {
//		给IP地址排序
		String ip = "127.0.0.1  192.168.1.1  105.70.11.55  3.3.3.3";
		String regex = "(\\d+)";
		
//		为了按照字符串的顺序比较  保证每一位数相同
		String s = ip.replaceAll(regex,"00$1");
//		为了保证ip地址位数  将所有保留三位
		String s2 = s.replaceAll("0*([0-9]{3})","$1");
		System.out.println(s2);
		
		String[] str = s2.split(" +");
		for(String w : str) {
			
			System.out.println("w="+w);
			
		}
		
		
		TreeSet<String> tr = new TreeSet<String>();
		tr.clear();
		for(int x=0;x<str.length;x++) {
			tr.add(str[x]);
			
		}
		
		
		
		for(String d : tr) {
			System.out.println("end="+d.replaceAll("0*(\\d+)","$1"));
			
		}
		
		
		
		
	}

	
	
	
	public static void replaceAll() {
		String str = "adfsssssunppppw";
		String s = str.replaceAll("(.)\\1+", "$1");
		System.out.println(s);
	}
	

}
