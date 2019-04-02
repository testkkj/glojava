package Example.chap7_5_2;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//오버라이딩을 할 수 없음
	/*
	@Override
	public final void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	*/

}
