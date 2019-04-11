package extra.chap11_03_reflect;

import java.io.UnsupportedEncodingException;

public class strbyt {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//String str = "AaBbCc";
		String str = "자바";
		
		//문자열을 바이트 배열로 인코딩
		byte[] byte1 = str.getBytes();
		System.out.println("배열길이 "+byte1.length);
		for(byte b : byte1) {
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.println("*");
		
		//String 생성자를 이용해서 바이트배열을 문자열로 디코딩
		String str1 = new String(byte1);
		System.out.println(str1);
		System.out.println();
		System.out.println("*");
		
		//문자셋EUC-KR 이용하여 디코딩
		byte[] byte2 = str.getBytes("EUC-KR");
		System.out.println("배열길이 "+byte2.length);
		String str2 = new String(byte2, "EUC-KR");
		System.out.println(str2);
		System.out.println();
		System.out.println("*");
		
		//문자셋UTF-8 이용하여 인코딩
		byte[] byte3 = str.getBytes("UTF-8");
		System.out.println("배열길이 "+byte3.length);
		for(byte b : byte3) {
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.println("*");
		String bs = new String(byte3);
		System.out.println(bs);

	}

}
