package example;

public class PromotionExample {

	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue;	//int <- byte
		
		System.out.println(intValue);
		
		char charValue = '��';
		intValue = charValue;	//int <- char
		
		System.out.println("���� �����ڵ� = " + intValue);
		
		intValue = 500;
		long longValue = intValue;	//long <- int
		
		System.out.println(intValue);
		
		intValue = 200;
		double doubleValue = intValue; //double <- int
		
		System.out.println(intValue);

	}

}
