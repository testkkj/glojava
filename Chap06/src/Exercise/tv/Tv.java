package Exercise.tv;

public class Tv {
	String color = "gray";
	boolean power;
	int channel;
	
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
	}
	
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
	}
	
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}

}
