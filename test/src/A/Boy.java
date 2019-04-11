package A;
public class Boy extends Parents {
	public static void main(String[] args) {
		Parents p1 = new Parents();
		Parents p2 = new Boy();
		Parents p3 = new Girl();
		
		//Boy b1 = (Boy) p1;
		Boy b2 = (Boy) p2;
		//Boy b3 = (Boy) p3;
		
		p1.call();
		p2.call();
		p3.call();
		
		//b1.call();
		b2.call();
		//b3.call();
	}
	@Override
	void call() {
		System.out.println("Boy call");
	}
}

class Parents {
	void call() {
		System.out.println("parent call");
	}
}

class Girl extends Parents {
	@Override
	void call() {
		System.out.println("Girl call");
	}
}
