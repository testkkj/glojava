package exercise.chap07_07;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire st = new SnowTire();
		Tire t = st;
		
		st.run();
		t.run();

	}

}
