package Exercise.print;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color = "white";
		car1.gearType = "auto";
		car1.door = 4;
		
		Car car2 = new Car("yello", "auto", 2);
		
		System.out.println("car1 加己 : "+car1.color+" "+car1.gearType+" "+car1.door);
		System.out.println("car2 加己 : "+car2.color+" "+car2.gearType+" "+car2.door);

	}

}
