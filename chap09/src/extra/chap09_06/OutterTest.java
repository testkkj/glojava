package extra.chap09_06;

public class OutterTest {

	public static void main(String[] args) {
		Outter out = new Outter();
		Outter.Inner in = out.new Inner();
		in.method1();

	}

}
