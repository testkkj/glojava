package example.chap7_7_2;

public class CarExample {
	public static void main(String[] args) {
		Car1 car = new Car1();	//Car1 ��ü ����
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();	//Car1 ��ü�� run() �޼ҵ� 5�� �ݺ� ����
			
			switch(problemLocation) {
			case 1:	//�տ��� Ÿ�̾ ��ũ ���� �� HankookTire�� ��ü
				System.out.println("�տ��� HankookTire�� ��ü");
				car.frontLeftTire = new HankookTire("�տ���", 15);
				break;
			case 2:	//�տ����� Ÿ�̾ ��ũ ���� �� KumhoTire�� ��ü
				System.out.println("�տ����� KumhoTire�� ��ü");
				car.frontLeftTire = new HankookTire("�տ�����", 13);
				break;
			case 3:	//�ڿ��� Ÿ�̾ ��ũ ���� �� HankookTire�� ��ü
				System.out.println("�ڿ��� HankookTire�� ��ü");
				car.frontLeftTire = new HankookTire("�ڿ���", 14);
				break;
			case 4:	//�ڿ����� Ÿ�̾ ��ũ ���� �� KumhoTire�� ��ü
				System.out.println("�ڿ����� KumhoTire�� ��ü");
				car.frontLeftTire = new HankookTire("�ڿ�����", 17);
				break;
			}
			System.out.println("--------------------------------------------------");
			//1ȸ�� �� ��µǴ� ������ ����
		}
	}

}
