package augest.week3.regex.demo;

import java.util.TreeSet;

public class RegexDemo {

	public static void main(String[] args) {
//		replaceAll();
		
		
		
		ipSort();
			
				
	}

	public static void ipSort() {
//		��IP��ַ����
		String ip = "127.0.0.1  192.168.1.1  105.70.11.55  3.3.3.3";
		String regex = "(\\d+)";
		
//		Ϊ�˰����ַ�����˳��Ƚ�  ��֤ÿһλ����ͬ
		String s = ip.replaceAll(regex,"00$1");
//		Ϊ�˱�֤ip��ַλ��  �����б�����λ
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
