package example.chap12_06_04;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA(0) �۾� ����");
		notify();
		try {
			wait();
		} catch (Exception e) {
			
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadA�� methodB(1) �۾� ����");
		notify();
		try {
			wait();
		} catch (Exception e) {
			
		}
	}

}
