package A;

public class exception1 {

	public static void main(String[] args) {
		try {
			findClass();
		} catch(Exception e) {
			System.out.println("�˼� ���� �����Դϴ�.");
		}

	}
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
		
	}

}
