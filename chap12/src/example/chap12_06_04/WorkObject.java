package example.chap12_06_04;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA(0) 작업 실행");
		notify();
		try {
			wait();
		} catch (Exception e) {
			
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadA의 methodB(1) 작업 실행");
		notify();
		try {
			wait();
		} catch (Exception e) {
			
		}
	}

}
