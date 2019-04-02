package extra.chap08_01;

public class FrindleExample {
	public static void gwrite(Frindle frindle) {
		frindle.write();
	}

	public static void main(String[] args) {
		gwrite(new Pencil());
		gwrite(new Ballpoint());

	}

}
