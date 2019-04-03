package Exercise.print;

public class CardTest {

	public static void main(String[] args) {
		System.out.println("Card width = "+Card.width);
		System.out.println("Card height = "+Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		System.out.println("c1은"+c1.kind+", 숫자는"+c1.number+"이다.");

	}

}
