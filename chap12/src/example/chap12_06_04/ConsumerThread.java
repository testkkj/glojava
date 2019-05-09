package example.chap12_06_04;

public class ConsumerThread extends Thread {
	private DataBox db;

	public ConsumerThread(DataBox db) {
		this.db = db;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String data = db.getData();
		}
	}

}
