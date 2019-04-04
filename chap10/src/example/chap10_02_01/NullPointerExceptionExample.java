package example.chap10_02_01;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String data = null;
		try {
			System.out.println(data.toString());
		} catch (NullPointerException e){
			System.out.println(e);
		} finally {
			System.out.println("¾ÈµÇ...");
		}
	}

}
