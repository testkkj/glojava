package Exercixe;

import java.util.Scanner;

public class extra03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int user = 0;
		int com = 0;
		
		System.out.print("가위(1), 바위(2), 보(3) 중에 하나를 입력하세요>");
		user = sc.nextInt();
		
		com = (int)(Math.random()*3)+1;
		
		switch (user) {
		case 1:
			if (user == com) {
				System.out.println("비겼습니다.");
				break;
			} else if(user < com & user <2) {
				System.out.println("졌습니다.");
				break;
			} else {
				System.out.println("이겼습니다.");
				break;
			}
		case 2:
			if (user == com) {
				System.out.println("비겼습니다.");
				break;
			} else if(user < com) {
				System.out.println("졌습니다.");
				break;
			} else {
				System.out.println("이겼습니다.");
				break;
			}
		case 3:
			if (user == com) {
				System.out.println("비겼습니다.");
				break;
			} else if(1 < com & com < user) {
				System.out.println("이겼습니다.");
				break;
			} else {
				System.out.println("졌습니다.");
				break;
			}
		}

	}

}
