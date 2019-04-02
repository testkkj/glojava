package example.chap08_07_01;

public class DefaultMethodExample {

	public static void main(String[] args) {
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		mi1.method2();
		
		MyInterface mi2 = new MyClassB();
		mi1.method1();
		mi1.method2();

	}

}
