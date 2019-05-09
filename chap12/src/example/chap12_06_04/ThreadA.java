package example.chap12_06_04;

public class ThreadA extends Thread {
	private WorkObject wo;

	public ThreadA(WorkObject wo) {
		this.wo = wo;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			wo.methodA();
		}
	}

}
