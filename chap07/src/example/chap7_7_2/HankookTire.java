package example.chap7_7_2;

public class HankookTire extends Tire {
	//�ʵ�
	
	//������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//�޼ҵ�
	/*��� ������ �޸��ϱ� ���� ������(�������̵�)�� roll() �޼ҵ�*/
	@Override
	public boolean roll() {
		++accumulatedRotation;	//���� ȸ���� 1����
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " HankookTire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire ��ũ ***");
			return false;
		}
	}

}