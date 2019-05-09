package example.chap12_06_05;

public class InterruptExample {

	public static void main(String[] args) {
		Thread thread = new PrintThread2_1();
		thread.start();

		try {
			thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}

		thread.interrupt();
	}

}
