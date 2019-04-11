package extra.chap11_03_reflect;

import java.io.UnsupportedEncodingException;

public class strbyt {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//String str = "AaBbCc";
		String str = "�ڹ�";
		
		//���ڿ��� ����Ʈ �迭�� ���ڵ�
		byte[] byte1 = str.getBytes();
		System.out.println("�迭���� "+byte1.length);
		for(byte b : byte1) {
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.println("*");
		
		//String �����ڸ� �̿��ؼ� ����Ʈ�迭�� ���ڿ��� ���ڵ�
		String str1 = new String(byte1);
		System.out.println(str1);
		System.out.println();
		System.out.println("*");
		
		//���ڼ�EUC-KR �̿��Ͽ� ���ڵ�
		byte[] byte2 = str.getBytes("EUC-KR");
		System.out.println("�迭���� "+byte2.length);
		String str2 = new String(byte2, "EUC-KR");
		System.out.println(str2);
		System.out.println();
		System.out.println("*");
		
		//���ڼ�UTF-8 �̿��Ͽ� ���ڵ�
		byte[] byte3 = str.getBytes("UTF-8");
		System.out.println("�迭���� "+byte3.length);
		for(byte b : byte3) {
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.println("*");
		String bs = new String(byte3);
		System.out.println(bs);

	}

}
