package Example;

public class CarExample4 {

	public static void main(String[] args) {
		Car4 myCar = new Car4();
		
		myCar.setGas(5);	//Car�� setGas() �޼ҵ� ȣ��
		
		boolean gasState = myCar.isLeftGas();	//Car�� isLeftGas() �޼ҵ� ȣ��
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run();	//Car�� run() �޼ҵ� ȣ��
		}
		
		if(myCar.isLeftGas()) {	//Car�� isLeftGas() �޼ҵ� ȣ��
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���.");
		}

	}

}
