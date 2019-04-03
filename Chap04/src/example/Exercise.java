package example;

public class Exercise {

	public static void main(String[] args) {
		int sum = 0;
		
		if (sum == 0) {
			int v2 = 10;
			int v3 = 20;
			
			sum = add(v2, v3);
		}
		
		System.out.println(sum);
	}
	
	private static int add (int a, int b) {
		return a+b;
	}

}
