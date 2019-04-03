package exercixe;

import java.util.*;

public class Exercise07_1 {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		
		int balance = 0;
		
		String keyCode = "0";
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		while (run) {
			if (keyCode != "\n") {
			System.out.println("--------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("--------------------");
			System.out.print("����>");
			}
		
		keyCode = System.in.toString();
		
		if (keyCode == "1") { //1�� �о��� ���
			System.out.print("���ݾ�> ");
			inputString = scanner.nextLine();
			try {
				balance = Integer.parseInt(inputString);
			} catch (NumberFormatException e) {
			}
		} else if (keyCode == "2") { //2�� �о��� ���
			System.out.print("��ݾ�> ");
			inputString = scanner.nextLine();
		} else if (keyCode == "3") { //3�� �о��� ���
			System.out.println("�ܰ�> " + balance);
		} else if (keyCode == "4") { //4�� �о��� ���
			run = false;
		}
		
		}
		
		System.out.println("���α׷� ����");

	}

}
