package A;

public class ASDF {

	public static void main(String[] args) {
		for(int i = 0; i<=5; i++) {
			System.out.println();
			for(int j = 5; j>=0; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k<=i; k++) {
				System.out.print("*");
			}
		}

	}

}
