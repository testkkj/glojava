package example.chap11_03_05;

public class FinalizeExample {

	public static void main(String[] args) {
		Counter counter = null;
		
		for(int i=1; i<=100000; i++) {
			counter = new Counter(i);
			
			counter = null;
			
			System.gc();
		}

	}

}
