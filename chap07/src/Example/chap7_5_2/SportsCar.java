package Example.chap7_5_2;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//�������̵��� �� �� ����
	/*
	@Override
	public final void stop() {
		System.out.println("������ī�� ����");
		speed = 0;
	}
	*/

}
