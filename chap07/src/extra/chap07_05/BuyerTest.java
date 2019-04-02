package extra.chap07_05;

public class BuyerTest {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		buyer.buy(new Tv(5000));
		buyer.buy(new Computer(1000));
		
		System.out.println("현재 남은 돈은 "+buyer.money+"입니다.");
		System.out.println("현재 보너스 점수는 "+buyer.bounusPoint+"입니다.");

	}

}
