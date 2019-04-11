package AllQuestions.p_03;

public class OutterExample {

	public static void main(String[] args) {
		Outter1 out = new Outter1();
		Outter1.Nested nes = out.new Nested();
		nes.print();

	}

}

class Outter1 {
	String field = "Outter-field";
	
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			Nested nes = new Nested();
			System.out.println(nes.field);
			method();
			System.out.println(Outter1.this.field);
			Outter1.this.method();
			
		}
	}
}
