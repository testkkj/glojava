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
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------");
			System.out.print("선택>");
			}
		
		keyCode = System.in.read();
		
		if (keyCode == 49) { //1을 읽었을 경우
			System.out.print("예금액> ");
			inputString = scanner.nextInt();
			balance += inputString;
		} else if (keyCode == 50) { //2를 읽었을 경우
			System.out.print("출금액> ");
			inputString = scanner.nextInt();
			balance -= inputString;
		} else if (keyCode == 51) { //3를 읽었을 경우
			System.out.println("잔고> " + balance);
		} else if (keyCode == 52) { //4를 읽었을 경우
			run = false;
		}
		
		}
		
		System.out.println("프로그램 종료");

	}

}
