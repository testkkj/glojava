package extra.chap09_07;

public class A {
	class B {
		int iv = 10;
		int cv = 10;
		final static int CONST = 100;
	}
	
	static class C {
		int iv = 20;
		static int cv = 200;
	}
	
	void method() {
		class D {
			int iv = 300;
			int cv = 300;
			final static int CONST = 300;
		}
		/*빠트린것*/
		D d = new D();
		System.out.println(d.iv + D.CONST);
	}
}
