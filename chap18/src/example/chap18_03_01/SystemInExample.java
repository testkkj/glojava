package example.chap18_03_01;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample {

	public static void main(String[] args) throws Exception {
		System.out.println("== �޴� ==");
		System.out.println("1. ���� ��ȸ");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� �Ա�");
		System.out.println("4. ���� �ϱ�");
		System.out.println("�޴��� �����ϼ���.");
		
		InputStream is = System.in;
		char inputChar = (char) is.read();
		switch(inputChar) {
		case '1':
			System.out.println();
			break;
		case '2':
			System.out.println();
			break;
		case '3':
			System.out.println();
			break;
		case '4':
			System.out.println("���ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ��������ķ�ٲٷ�����");
			break;
		}

	}

}
