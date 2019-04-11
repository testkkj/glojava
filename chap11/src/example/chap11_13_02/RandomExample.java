package example.chap11_13_02;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		for (int j = 0; j < 50000000; j++) {
			// ���ù�ȣ
			int[] selectNumber = new int[6];
			Random random = new Random();
			System.out.println("���� ��ȣ: ");
			for (int i = 0; i < 6; i++) {
				selectNumber[i] = random.nextInt(45) + 1;
				System.out.println(selectNumber[i] + " ");
			}
			System.out.println();

			// ��÷��ȣ
			int[] winningNumber = new int[6];
			random = new Random();
			System.out.println("��÷ ��ȣ: ");
			for (int i = 0; i < 6; i++) {
				winningNumber[i] = random.nextInt(45) + 1;
				System.out.println(winningNumber[i] + " ");
			}
			System.out.println();

			// ��÷����
			Arrays.sort(selectNumber);/* ���ϱ��� ���Ľ�Ŵ */
			Arrays.sort(winningNumber);
			boolean result = Arrays.equals(selectNumber, winningNumber);
			System.out.println("��÷ ����: ");
			if (result) {
				System.out.println("1� ��÷�Ǽ̽��ϴ�.");
				break;
			} else {
				System.out.println("��÷���� �ʾҽ��ϴ�.");
				int count = 0;
				count += 1;
				if (count == 500000000) {
					System.out.println("5õ������"+count);
				}
			}
		}

	}

}
