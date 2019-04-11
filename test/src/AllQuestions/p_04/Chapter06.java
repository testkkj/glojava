package AllQuestions.p_04;

public class Chapter06 {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}

	}

}

class Singleton {
	private static Singleton instance;
	
	private Singleton() {
		
	}

	public static Singleton getInstance() {
		return instance;
	}

	public void setInstance(Singleton instance) {
		Singleton.instance = instance;
	}
}