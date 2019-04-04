package example.chap10_02_03;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "+" + result);
		}catch (NumberFormatException e){
			System.out.println("숫자가 아닌 문자열 입니다.");
		}

	}

}
