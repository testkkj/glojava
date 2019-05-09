package example.chap12_06_04;

public class WaitNotifyExample2 {

	public static void main(String[] args) {
		DataBox db = new DataBox();

		ProducerThread pt = new ProducerThread(db);
		ConsumerThread ct = new ConsumerThread(db);

		pt.start();
		ct.start();

	}

}
