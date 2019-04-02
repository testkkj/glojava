package example.chap08_05_06;

import example.chap08_05_05.Bus;
import example.chap08_05_05.Vehicle;

public class Driver {
	public void driver(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();	//Bus 타입으로 강제 타입 변환을 하는 이유
		}
		vehicle.run();
	}

}
