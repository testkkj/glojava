package Exercise;

public class Printer {
	int num;
	boolean tf;
	double nnum;
	String st;
	
	void println(int num) {
		this.num = num;
		System.out.println(this.num);
		
	}
	
	void println(boolean tf) {
		this.tf = tf;
		System.out.println(this.tf);
		
	}
	
	void println(double nnum){
		this.nnum = nnum;
		System.out.println(this.nnum);
		
	}
	
	void println(String st){
		this.st = st;
		System.out.println(this.st);
		
	}

}
