package extra.chap07_03$04;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		//Car car2 = new FireEngine();
		Car car2 = new Car();
		FireEngine fe = null;
		Ambulance am = new Ambulance();
		
		fe=new FireEngine();
		fe.water();
		car.drive(car);
		if(car2 instanceof FireEngine) {
			fe=(FireEngine)car2;
			fe.drive(fe);
		} else {
			System.out.println("����Ÿ�Ժ�ȯ �Ұ���");
		}
		am.siren();

	}

}
