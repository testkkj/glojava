package Exercise.tv;

public class TvExample {

	public static void main(String[] args) {
		Tv myTv = new Tv();
		
		System.out.println("TV Color : "+myTv.color);
		myTv.turnOn();
		myTv.channelUp();
		myTv.channelUp();
		System.out.println("���� TV ä�� : "+myTv.channel);
		myTv.turnOff();

	}

}
