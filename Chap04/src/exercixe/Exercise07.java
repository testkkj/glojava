package exercixe;

import java.util.*;

public class Exercise07 {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		
		int balance = 0;
		
		int keyCode = 0;
		
		Scanner scanner = new Scanner(System.in);
		int inputString;
		
		while (run) {
			if (keyCode != 13 && keyCode != 10) {
			System.out.println("--------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("--------------------");
			System.out.print("����>");
			}
		
		keyCode = System.in.read();
		
		if (keyCode == 49) { //1�� �о��� ���
			System.out.print("���ݾ�> ");
			inputString = scanner.nextInt();
			balance += inputString;
		} else if (keyCode == 50) { //2�� �о��� ���
			System.out.print("��ݾ�> ");
			inputString = scanner.nextInt();
			balance -= inputString;
		} else if (keyCode == 51) { //3�� �о��� ���
			System.out.println("�ܰ�> " + balance);
		} else if (keyCode == 52) { //4�� �о��� ���
			run = false;
		}
		
		}
		
		System.out.println("���α׷� ����");

	}

}
