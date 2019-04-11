package A;

public class zeroone {

	public static void main(String[] args) {
		for(int i=0; i<Integer.MAX_VALUE; i++) {
			for(int j=0; j<i; j++) {
				int a = (int)(Math.random()*2);
				System.out.print(a);
			}
			for(int j=0; j<1; j++) {
				System.out.println();
			}
		}

	}

}
