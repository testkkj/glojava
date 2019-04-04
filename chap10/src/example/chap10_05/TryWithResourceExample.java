package example.chap10_05;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();	//강제적으로 예외 발생시킴
		} catch(Exception e) {
			System.out.println("예외 처리 코드가 실해오디었습니다.");
		}

	}

}
