package example.chap12_06_02;

public class YieldExample {

	public static void main(String[] args) {
		ThreadA tha = new ThreadA();
		ThreadB thb = new ThreadB();

		tha.start();
		thb.start();

		try {
			Thread.sleep(10);
		} catch (Exception e) {

		}
		tha.work = false;

		try {
			Thread.sleep(10);
		} catch (Exception e) {

		}
		tha.work = true;

		try {
			Thread.sleep(10);
		} catch (Exception e) {

		}
		tha.stop = true;
		thb.stop = true;
		
	}
}