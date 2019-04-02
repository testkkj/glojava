package Exercixe;

public class Exercise05 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int z;
		for (x = 1; x <= 10; x++) {
			for (y = 1; y <=10; y++) {
				z = 4*x + 5*y;
				if (z == 60){
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}

	}

}
