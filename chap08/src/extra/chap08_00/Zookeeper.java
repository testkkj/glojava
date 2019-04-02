package extra.chap08_00;

public class Zookeeper {
	public void feed(Predator predator) {
		System.out.println("feed "+predator.getfeed());
	}

	public static void main(String[] args) {
		Zookeeper zookeeper = new Zookeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		zookeeper.feed(tiger);
		zookeeper.feed(lion);

	}

}
