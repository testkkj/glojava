package extra.chap09_06;

public class Outter {
	int value = 10;
	
	class Inner {
		int value = 20;
		
		void method1() {
			int value = 30;
			System.out.println("             value : "+value);
			System.out.println(" 	this.value : "+this.value);
			System.out.println(" Outter.this.value : "+Outter.this.value);
		}
	}

}
