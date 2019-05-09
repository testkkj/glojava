package example.chap12_02_02;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("¶ò");
			try {
				thread.sleep(500);
			} catch (Exception e) {

			}
		}

	}

}
