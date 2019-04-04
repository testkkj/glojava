package example.chap10_02_02;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
			try {
				String data1 = args[0];
				String data2 = args[1];
				
				System.out.println("args[0]: "+data1);
				System.out.println("args[1]: "+data2);
				
				int a = Integer.parseInt(data1);
				int b = Integer.parseInt(data2);
				System.out.println(a+b);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("값이 없습니다.");
			}

	}
}
