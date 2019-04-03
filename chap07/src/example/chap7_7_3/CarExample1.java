package example.chap7_7_3;

import example.chap7_7_2.HankookTire;
import example.chap7_7_2.KumhoTire;

public class CarExample1 {
	public static void main(String[] args) {
		Car car = new Car();	//Car2 ��ü ����
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();	//Car2 ��ü�� run() �޼ҵ� 5�� �ݺ� ����
			if(problemLocation == 1 && problemLocation == 3) {
				System.out.println(car.tires[problemLocation-1].location + "HankookTire�� ��ü");
				car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 15);
			} else if(problemLocation == 2 && problemLocation == 4) {
				System.out.println(car.tires[problemLocation-1].location + "KumhoTire�� ��ü");
				car.tires[problemLocation-1] = new KumhoTire(car.tires[problemLocation-1].location, 15);
			}
			System.out.println("--------------------------------------------------");
			//1ȸ�� �� ��µǴ� ������ ����
		}
	}

}
