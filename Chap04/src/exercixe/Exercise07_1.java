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
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------");
			System.out.print("선택>");
			}
		
		keyCode = System.in.toString();
		
		if (keyCode == "1") { //1을 읽었을 경우
			System.out.print("예금액> ");
			inputString = scanner.nextLine();
			try {
				balance = Integer.parseInt(inputString);
			} catch (NumberFormatException e) {
			}
		} else if (keyCode == "2") { //2를 읽었을 경우
			System.out.print("출금액> ");
			inputString = scanner.nextLine();
		} else if (keyCode == "3") { //3를 읽었을 경우
			System.out.println("잔고> " + balance);
		} else if (keyCode == "4") { //4를 읽었을 경우
			run = false;
		}
		
		}
		
		System.out.println("프로그램 종료");

	}

}
