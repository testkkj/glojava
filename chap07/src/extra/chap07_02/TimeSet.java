package extra.chap07_02;

public class TimeSet {
	int Hour;
	int Minute;
	int Second;
	
	TimeSet(int Hour, int Minute, int Second) {
		this.Hour = Hour;
		this.Minute = Minute;
		this.Second = Second;
		
	}
	
	public int getHour() {
		return Hour;
	}
	public void setHour(int Hour) {
		this.Hour = Hour;
	}
	public int getMinute() {
		return Minute;
	}
	public void setMinute(int Minute) {
		if(Minute < 60) {
			this.Minute = Minute;
		} else if(Minute > 60) {

		}
	}
	public int getSecond() {
		return Second;
	}
	public void setSecond(int Second) {
		if(Second < 60) {
			this.Second = Second;
		} else if(Second > 60) {

		}
		
	}
	
	
}
