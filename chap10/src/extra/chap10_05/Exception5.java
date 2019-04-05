package extra.chap10_05;

public class Exception5 {

	public static void main(String[] args) {
		try {
			method();
		} catch(Exception e) {
			System.out.println("method()에서 예외가 처리되었습니다.");
		}

	}
	
	static void method() throws Exception{
		throw new Exception();
		
	}

}
