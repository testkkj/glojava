package example.chap12_06_04;

public class DataBox {
	private String data;

	public synchronized String getData() {
		if (this.data == null) {
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		String returnValue = data;
		System.out.println("ConsummerThread�� ���� ������: " + returnValue);
		data = null;
		notify();
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		if (this.data != null) {
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		this.data = data;
		System.out.println("ProducerThread�� ���� ������: " + data);
		notify();
	}

}
