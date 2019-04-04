package extra.chap09_07;

public class InnterTest {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		System.out.println(b.CONST);
		
		A.C c = new A.C();
		System.out.println(c.cv);

	}

}
