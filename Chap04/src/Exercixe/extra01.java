package Exercixe;

import java.io.IOException;
import java.util.Scanner;

public class extra01 {

	public static void main(String[] args) throws IOException {
		
		boolean run = true;
		
		
		Scanner sc = new Scanner(System.in);
		
		while (run) {
				System.out.print("���ڸ� �ϳ� �Է��ϼ���>");
				int input = sc.nextInt();
				System.out.println("�Է��Ͻ� ���ڴ� " + input + "�Դϴ�.");
		}

	}

}
