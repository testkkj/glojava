package Exercise;

public class Printer1 {
	static int num;
	static boolean tf;
	static double nnum;
	static String st;
	
	static void println(int num) {
		Printer1 p = new Printer1();
		p.num = num;
		System.out.println(p.num);
		
	}
	
	static void println(boolean tf) {
		Printer1 p = new Printer1();
		p.tf = tf;
		System.out.println(p.tf);
		
	}

	static void println(double nnum){
		Printer1 p = new Printer1();
		p.nnum = nnum;
		System.out.println(p.nnum);
		
	}

	static void println(String st){
		Printer1 p = new Printer1();
		p.st = st;
		System.out.println(p.st);
		
	}

}
