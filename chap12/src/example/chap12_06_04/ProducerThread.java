package example.chap12_06_04;

public class ProducerThread extends Thread {
	private DataBox db;

	public ProducerThread(DataBox db) {
		this.db = db;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String data = "Data-" + i;
			db.setData(data);
		}
	}

}
