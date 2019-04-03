package example.chap7_7_3;

import example.chap7_7_2.HankookTire;
import example.chap7_7_2.KumhoTire;

public class CarExample1 {
	public static void main(String[] args) {
		Car car = new Car();	//Car2 객체 생성
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();	//Car2 객체의 run() 메소드 5번 반복 실행
			if(problemLocation == 1 && problemLocation == 3) {
				System.out.println(car.tires[problemLocation-1].location + "HankookTire로 교체");
				car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 15);
			} else if(problemLocation == 2 && problemLocation == 4) {
				System.out.println(car.tires[problemLocation-1].location + "KumhoTire로 교체");
				car.tires[problemLocation-1] = new KumhoTire(car.tires[problemLocation-1].location, 15);
			}
			System.out.println("--------------------------------------------------");
			//1회전 시 출력되는 내용을 구분
		}
	}

}
