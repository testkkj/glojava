package extra.chap10_04;

public class Exception3 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시킴");
			//throw new Exception("고의로 발생시킴");
			throw e;
		} catch(Exception e) {
			System.out.println("에러: " + e.getMessage());
		}
		System.out.println("프로그램 정상 종료");

	}

}
