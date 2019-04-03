package Exercise.print;

public class TvExample {

	public static void main(String[] args) {
		Tv myTv = new Tv();
		
		System.out.println("TV »öÀº : "+myTv.color);
		System.out.println();
		myTv.powerOn();
		myTv.chanUp();
		myTv.chanDown();
		myTv.powerOff();
	}
	
}
