package example.chap12_06_05;

public class PrintThread2_1 extends Thread {
	public void run() {
		while (true) {
			System.out.println("���� ��");
			if (Thread.interrupted()) {
				break;
			}
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
