package extra.chap10_04;

public class Exception3 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("���Ƿ� �߻���Ŵ");
			//throw new Exception("���Ƿ� �߻���Ŵ");
			throw e;
		} catch(Exception e) {
			System.out.println("����: " + e.getMessage());
		}
		System.out.println("���α׷� ���� ����");

	}

}
