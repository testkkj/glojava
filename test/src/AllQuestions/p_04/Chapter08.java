package AllQuestions.p_04;

public class Chapter08 implements ChildInterface1{

	public static void main(String[] args) {
		Chapter08 mn = new Chapter08();
		mn.method2();

	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

}

interface ParentInterface {
	public void method1();
	public default void method2() {
		System.out.println("ParentInterface-method2() 실행");
	}
}

interface ChildInterface1 extends ParentInterface {
	public void method3();
	
	@Override
	public default void method2() {
		System.out.println("ChildInterface-method2() 실행");
	}
	
}