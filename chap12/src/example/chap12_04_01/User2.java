package example.chap12_04_01;

public class User2 extends Thread {
	private Calculator cal;

	public void setCalculator(Calculator cal) {
		this.setName("User2");
		this.cal = cal;
	}

	public void run() {
		cal.setMemory(50);
	}

}
