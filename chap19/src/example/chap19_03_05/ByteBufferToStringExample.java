package example.chap19_03_05;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class ByteBufferToStringExample {

	public static void main(String[] args) {
		Charset charset = Charset.forName("UTF-8");

		String data = "�ȳ��ϼ���";
		ByteBuffer byteBuffer = charset.encode(data);

		data = charset.decode(byteBuffer).toString();
		System.out.println("���ڿ� ����: " + data);

	}

}
