package exercise;

import java.io.IOException;
import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) throws IOException {
		boolean run = true;
		int bal = 0;
		int keyCode = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (run) {
				System.out.println("------------------------------");
				System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
				System.out.println("------------------------------");
				System.out.print("����> ");
			
			keyCode = sc.nextInt();
			
			if (keyCode == 1) {
				System.out.print("���ݾ�>");
				keyCode = sc.nextInt();
				bal += keyCode;
			} else if (keyCode == 2) {
				System.out.print("��ݾ�>");
				keyCode = sc.nextInt();
				bal -= keyCode;
			} else if (keyCode == 3) {
				System.out.println("�ܰ�>" + bal);
			} else {
				run = false;
			}
		}
		
		System.out.println("���α׷� ����");

	}

}
