package AllQuestions.p_02;

public class Chapter07 {
	
	public static void method1(A a) {
		if(a instanceof B) {
			System.out.println("B�� ��ȯ ����");
		} else {
			System.out.println("B�� ��ȯ ��������");
		}
	}

	public static void main(String[] args) {
		A a = new B();
		
		method1(a);
		
		A b = new A();
		
		method1(b);

	}

}

class A {
	
}

class B extends A{
	
}