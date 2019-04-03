package exercise;

public class Exercise04 {

	public static void main(String[] args) {
		while (true) {
			int nun1 = (int)(Math.random()*6) + 1;
			int nun2 = (int)(Math.random()*6) + 1;
			
			System.out.println(nun1+", "+nun2);
			
			if (nun1 + nun2 == 5) {
				break;
			}
		}

	}

}
