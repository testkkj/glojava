package extra.chap11_04_regexp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExp {

	public static void main(String[] args) {
		//���ڸ� ���
		String regEx = "^[0-9]*$";
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		boolean result = Pattern.matches(regEx, input);
		if(result) {
			int num = Integer.parseInt(input);
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("���ڸ� �Է��ϼ���.");
		}
		
		//��� ���
		regEx = "^[a-zA-z]*$";
		sc = new Scanner(System.in);
		input = sc.nextLine();
		result = Pattern.matches(regEx, input);
		if(result) {
			int num = Integer.parseInt(input);
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("���ڸ� �Է��ϼ���.");
		}

	}

}
