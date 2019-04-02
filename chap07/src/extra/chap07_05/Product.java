package extra.chap07_05;

public class Product {
	int price;
	int bounusPoint;
	public Product(int price) {
		this.price = price;
		this.bounusPoint = (int)(price/10);
	}
}

class Tv extends Product {

	public Tv(int price) {
		super(price);
	}
	
}

class Computer extends Product {

	public Computer(int price) {
		super(price);
	}
	
}

class Buyer {
	int money = 10000;
	int bounusPoint;
	void buy(Product p) {
		money = money - p.price;
		bounusPoint = bounusPoint + p.bounusPoint;
	}
}