package AllQuestions.p_02;

public class Chapter09 {
	
	public static void main(String[] args) {
		Anonymous a = new Anonymous();
		a.field.run();
	}

}

class Anonymous {
	
	Vehicle field = new Vehicle() {

		@Override
		public void run() {
			System.out.println("�޸��ϴ�.");
		
	}
	};
}


interface Vehicle {
	public void run();
}