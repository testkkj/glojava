package Exercise.print;

public class CardTest {

	public static void main(String[] args) {
		System.out.println("Card width = "+Card.width);
		System.out.println("Card height = "+Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		System.out.println("c1��"+c1.kind+", ���ڴ�"+c1.number+"�̴�.");

	}

}
