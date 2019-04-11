package A;

public class A {
	public static int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 20;
	
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.e);

	}

}

class B extends A {
	int q = a+b;
	int w = b+c;
	int e = c+getD();

}
