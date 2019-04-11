package AllQuestions.p_02;

public class Chapter07 {
	
	public static void method1(A a) {
		if(a instanceof B) {
			System.out.println("B로 변환 성공");
		} else {
			System.out.println("B로 변환 되지않음");
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