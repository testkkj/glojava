package Example.chap7_5_2;

public class Car {
	//�ʵ�
	public int speed;
	
	//�޼ҵ�
	public void speedUp() {
		speed += 1;
	}
	
	//�޼ҵ�
	public final void stop() {
		System.out.println("���� ����");
		speed = 0;
	}

}
