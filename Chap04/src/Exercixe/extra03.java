package Exercixe;

import java.util.Scanner;

public class extra03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int user = 0;
		int com = 0;
		
		System.out.print("����(1), ����(2), ��(3) �߿� �ϳ��� �Է��ϼ���>");
		user = sc.nextInt();
		
		com = (int)(Math.random()*3)+1;
		
		switch (user) {
		case 1:
			if (user == com) {
				System.out.println("�����ϴ�.");
				break;
			} else if(user < com & user <2) {
				System.out.println("�����ϴ�.");
				break;
			} else {
				System.out.println("�̰���ϴ�.");
				break;
			}
		case 2:
			if (user == com) {
				System.out.println("�����ϴ�.");
				break;
			} else if(user < com) {
				System.out.println("�����ϴ�.");
				break;
			} else {
				System.out.println("�̰���ϴ�.");
				break;
			}
		case 3:
			if (user == com) {
				System.out.println("�����ϴ�.");
				break;
			} else if(1 < com & com < user) {
				System.out.println("�̰���ϴ�.");
				break;
			} else {
				System.out.println("�����ϴ�.");
				break;
			}
		}

	}

}
