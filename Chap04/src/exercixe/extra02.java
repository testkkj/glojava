package exercixe;

import java.util.Scanner;

public class extra02 {

	public static void main(String[] args) {
		
		int inkey = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� �Է��ϼ���>");
		inkey = sc.nextInt();
		
		switch (inkey) {
		case 3:
		case 4:
		case 5:
			System.out.println("���� ������ ���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("���� ������ �����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("���� ������ �����Դϴ�.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("���� ������ �ܿ��Դϴ�.");
			break;
		}
		

	}

}
