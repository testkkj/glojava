package AllQuestions.p_04;

public class Chapter03 {

	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		System.out.println(toBinaryString(v1));
		System.out.println(toBinaryString(v2));

	}

	private static String toBinaryString(int v1) {
		String str = Integer.toBinaryString(v1);
		while(str.length()<64) {
			str = "0"+str;
		}
		return str;
	}
}