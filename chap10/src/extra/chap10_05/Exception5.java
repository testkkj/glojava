package extra.chap10_05;

public class Exception5 {

	public static void main(String[] args) {
		try {
			method();
		} catch(Exception e) {
			System.out.println("method()���� ���ܰ� ó���Ǿ����ϴ�.");
		}

	}
	
	static void method() throws Exception{
		throw new Exception();
		
	}

}
