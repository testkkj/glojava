package example.chap16_09_01;

import java.util.Arrays;

public class AggregateExample {

	public static void main(String[] args) {
		long count = Arrays.stream(new int[] { 1, 2, 3, 4, 5 }).filter(n -> n % 2 == 0).count();
		System.out.println("2�� ��� ����: " + count);

		long sum = Arrays.stream(new int[] { 1, 2, 3, 4, 5 }).filter(n -> n % 2 == 0).sum();
		System.out.println("2�� ��� ����: " + count);

		double avg = Arrays.stream(new int[] { 1, 2, 3, 4, 5 }).filter(n -> n % 2 == 0).average().getAsDouble();
		System.out.println("2�� ����� ���: " + avg);

		int max = Arrays.stream(new int[] { 1, 2, 3, 4, 5 }).filter(n -> n % 2 == 0).max().getAsInt();
		System.out.println("�ִ밪: " + max);

		int min = Arrays.stream(new int[] { 1, 2, 3, 4, 5 }).filter(n -> n % 2 == 0).max().getAsInt();
		System.out.println("�ִ밪: " + min);

		int first = Arrays.stream(new int[] { 1, 2, 3, 4, 5 }).filter(n -> n % 3 == 0).findFirst().getAsInt();
		System.out.println("ù��° 3�� ���: " + first);

	}

}
