package example.chap08_05_05;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare();	(x) Vehicle �������̽����� checkFare()�� ����
		
		Bus bus = (Bus) vehicle;	//���� Ÿ�� ��ȯ
		
		bus.run();
		bus.checkFare();

	}

}
