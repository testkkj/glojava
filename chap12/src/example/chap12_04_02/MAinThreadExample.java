package example.chap12_04_02;

public class MAinThreadExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();

		User1 user1 = new User1();
		user1.setCalculator(cal);
		user1.start();

		User2 user2 = new User2();
		user2.setCalculator(cal);
		user2.start();

	}

}
