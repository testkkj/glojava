package example.chap12_04_02;

public class User1 extends Thread {
	private Calculator cal;

	public void setCalculator(Calculator cal) {
		this.setName("User1");
		this.cal = cal;
	}

	public void run() {
		cal.setMemory(100);
	}

}
