package example.chap08_04_02;

import example.chap08_02_05.RemoteControl;

public class Audio implements RemoteControl {
	//필드
	private int volume;
	private boolean mute;
	
	//turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	//turnOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	//setVolume() 추상 메소드의 실체 메소드
	public void setVolume(int volume) {
		/*인터페이스 상수를 이용해서
		 * volume 필드의 값을 제한*/
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: "+volume);
	}
	
	@Override
	/*디폴트 메소드 재정의*/
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio 무음 처리합니다.");
		} else {
			System.out.println("Audio 무음 해제합니다.");
		}
	}

}
