package example.chap08_02_03;

public interface RemoteControl {
	//���
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�
	public void turnOn();
	public void turnOff();
	public void setVolume(int Volume);
	/*
	 *�޼ҵ� ����θ� �ۼ�
	 *(�߻� �޼ҵ�)
	 */

}
