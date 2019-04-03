package extra.chap08_07;

public interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	
	default void method2() {
		System.out.println("method2() in MyInterface2");
	}

}
