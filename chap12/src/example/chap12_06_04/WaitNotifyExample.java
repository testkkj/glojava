package example.chap12_06_04;

public class WaitNotifyExample {

	public static void main(String[] args) {
		WorkObject so = new WorkObject();
		
		ThreadA threadA = new ThreadA(so);
		ThreadB threadB = new ThreadB(so);
		
		threadA.start();
		threadB.start();

	}

}
