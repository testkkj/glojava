package extra.chap08_07;

public class Child extends Parent implements MyInterface, MyInterface2{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		MyInterface.super.method1();
	}

}
