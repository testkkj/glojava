package example.chap08_06;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();	//InterFaceA변수는 methodA()만 호출 가능
		
		InterfaceB ib = impl;
		ib.methodB();			//InterFaceB변수는 methodB()만 호출 가능
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		/*InterfaceC 변수는 methodA(), methodB(), methodC() 모두 호출 가능*/

	}

}
