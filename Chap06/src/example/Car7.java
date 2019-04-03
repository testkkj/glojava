package example;

public class Car7 {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		//Car1~6사이에 있음
		Car5 myCar = new Car5();
		myCar.speed = 60;
		myCar.run();
	}

}
