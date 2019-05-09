package example.chap12_06_03;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();
		} catch (Exception e) {

		}

		System.out.println("1~100 гу: " + sumThread.getSum());

	}

}
