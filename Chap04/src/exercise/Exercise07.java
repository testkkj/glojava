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
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("------------------------------");
				System.out.print("선택> ");
			
			keyCode = sc.nextInt();
			
			if (keyCode == 1) {
				System.out.print("예금액>");
				keyCode = sc.nextInt();
				bal += keyCode;
			} else if (keyCode == 2) {
				System.out.print("출금액>");
				keyCode = sc.nextInt();
				bal -= keyCode;
			} else if (keyCode == 3) {
				System.out.println("잔고>" + bal);
			} else {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");

	}

}
