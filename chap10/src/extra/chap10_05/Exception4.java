package extra.chap10_05;

public class Exception4 {

	public static void main(String[] args) {
		method();

	}
	
	static void method() {
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("method()���� ���ܰ� ó���Ǿ����ϴ�.");
			e.printStackTrace();
		}
	}

}
