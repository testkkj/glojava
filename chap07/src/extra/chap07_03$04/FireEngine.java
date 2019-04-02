package extra.chap07_03$04;

public class FireEngine extends Car {
	public void water() {
		System.out.println("FireEngine_water!!!");
	}
	
	@Override
	public void drive(Car car) {
		System.out.println("FireEngine_drive, Brrr");
	}

}
