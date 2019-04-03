package Exercise.tv;

public class Tv {
	String color = "gray";
	boolean power;
	int channel;
	
	public void turnOn() {
		System.out.println("TV¸¦ ÄÕ´Ï´Ù");
	}
	
	public void turnOff() {
		System.out.println("TV¸¦ ²ü´Ï´Ù");
	}
	
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}

}
