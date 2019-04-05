package extra.chap10_05;

public class Exception4 {

	public static void main(String[] args) {
		method();

	}
	
	static void method() {
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("method()에서 예외가 처리되었습니다.");
			e.printStackTrace();
		}
	}

}
