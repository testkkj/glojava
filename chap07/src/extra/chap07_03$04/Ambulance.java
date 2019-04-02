package extra.chap07_03$04;

public class Ambulance extends Car {
	public void siren() {
		System.out.println("siren~~~~~~");
	}
	
	@Override
	public void drive(Car car) {
		System.out.println("FireEngine_drive, Brrr");
	}

}
