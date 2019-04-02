package example.chap08_04_01;

import example.chap08_02_05.RemoteControl;
import example.chap08_03_01.Audio;
import example.chap08_03_01.Television;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();

	}

}
