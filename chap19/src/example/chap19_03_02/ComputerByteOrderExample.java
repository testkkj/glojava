package example.chap19_03_02;

import java.nio.ByteOrder;

public class ComputerByteOrderExample {

	public static void main(String[] args) {
		System.out.println("�ü�� ���� : " + System.getProperty("os.name"));
		System.out.println("����Ƽ���� ����Ʈ �ؼ� ���� : " + ByteOrder.nativeOrder());

	}

}
