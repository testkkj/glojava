package example.chap08_02_03;

public interface RemoteControl {
	//상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int Volume);
	/*
	 *메소드 선언부만 작성
	 *(추상 메소드)
	 */

}
