package example.chap18_03_04;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("���ڿ� �Է�>");
		String inputString = sc.nextLine();
		System.out.println(inputString);
		System.out.println();

		System.out.println("���� �Է�>");
		int inputInt = sc.nextInt();
		System.out.println(inputInt);
		System.out.println();

		System.out.println("�Ǽ� �Է�>");
		double inputDouble = sc.nextDouble();
		System.out.println(inputDouble);
		System.out.println();
	}

}
