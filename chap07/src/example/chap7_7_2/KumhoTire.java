package example.chap7_7_2;

public class KumhoTire extends Tire {
	//�ʵ�
	
	//������
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//�޼ҵ�
	/*��� ������ �޸��ϱ� ���� ������(�������̵�)�� roll() �޼ҵ�*/
	@Override
	public boolean roll() {
		++accumulatedRotation;	//���� ȸ���� 1����
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " KumhoTire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire ��ũ ***");
			return false;
		}
	}

}
