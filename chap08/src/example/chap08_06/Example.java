package example.chap08_06;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();	//InterFaceA������ methodA()�� ȣ�� ����
		
		InterfaceB ib = impl;
		ib.methodB();			//InterFaceB������ methodB()�� ȣ�� ����
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		/*InterfaceC ������ methodA(), methodB(), methodC() ��� ȣ�� ����*/

	}

}
