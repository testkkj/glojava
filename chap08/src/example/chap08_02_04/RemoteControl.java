package example.chap08_02_04;

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
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}

}
