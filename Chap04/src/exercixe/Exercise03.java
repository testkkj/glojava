package exercixe;

public class Exercise03 {

	public static void main(String[] args) {
		int j = 0;
		
		for (int i = 1; i <= 100; i++) {
		
			if (i%3 == 0) {
				j = j + i;
			}
		}
		
		System.out.println("3�� ����� ��: " + j);

	}

}