package example.chap11_07_01;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws Exception {
		byte[] bytes = new byte[1000];	//���� ����Ʈ�� �����ϱ� ���� �迭 ����
		
		System.out.println("�Է�: ");
		int readByteNo = System.in.read(bytes);	//�迭�� ���� ����Ʈ�� �����ϰ� ���� ����Ʈ���� ����
		
		String str = new String(bytes, 0, readByteNo-2);	//�迭�� ���ڿ��� ��ȯ
		System.out.println(str);

	}

}
