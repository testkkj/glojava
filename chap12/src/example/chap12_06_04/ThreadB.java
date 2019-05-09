package example.chap12_06_04;

public class ThreadB extends Thread {
	private WorkObject wo;

	public ThreadB(WorkObject wo) {
		this.wo = wo;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			wo.methodB();
		}
	}

}
