package example.chap12_06_05;

public class PrintThread2 extends Thread {
	public void run() {
		try {
			while (true) {
				System.out.println("���� ��");
				Thread.sleep(1);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}

}
