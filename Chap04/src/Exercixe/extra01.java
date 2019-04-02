package Exercixe;

import java.io.IOException;
import java.util.Scanner;

public class extra01 {

	public static void main(String[] args) throws IOException {
		
		boolean run = true;
		
		
		Scanner sc = new Scanner(System.in);
		
		while (run) {
				System.out.print("숫자를 하나 입력하세요>");
				int input = sc.nextInt();
				System.out.println("입력하신 숫자는 " + input + "입니다.");
		}

	}

}
