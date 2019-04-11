package example.chap11_13_02;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		for (int j = 0; j < 50000000; j++) {
			// 선택번호
			int[] selectNumber = new int[6];
			Random random = new Random();
			System.out.println("선택 번호: ");
			for (int i = 0; i < 6; i++) {
				selectNumber[i] = random.nextInt(45) + 1;
				System.out.println(selectNumber[i] + " ");
			}
			System.out.println();

			// 당첨번호
			int[] winningNumber = new int[6];
			random = new Random();
			System.out.println("당첨 번호: ");
			for (int i = 0; i < 6; i++) {
				winningNumber[i] = random.nextInt(45) + 1;
				System.out.println(winningNumber[i] + " ");
			}
			System.out.println();

			// 당첨여부
			Arrays.sort(selectNumber);/* 비교하기전 정렬시킴 */
			Arrays.sort(winningNumber);
			boolean result = Arrays.equals(selectNumber, winningNumber);
			System.out.println("당첨 여부: ");
			if (result) {
				System.out.println("1등에 당첨되셨습니다.");
				break;
			} else {
				System.out.println("당첨되지 않았습니다.");
				int count = 0;
				count += 1;
				if (count == 500000000) {
					System.out.println("5천만찍음"+count);
				}
			}
		}

	}

}
