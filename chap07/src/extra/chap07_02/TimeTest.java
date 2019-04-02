package extra.chap07_02;

public class TimeTest {

	public static void main(String[] args) {
		TimeSet ts = new TimeSet(12, 35, 30);
		
		System.out.println(ts.getHour()+":"+ts.getMinute()+":"+ts.getSecond());
		ts.setHour(ts.getHour()+1);
		System.out.println(ts.getHour()+":"+ts.getMinute()+":"+ts.getSecond());
		
		ts.setMinute(59);
		ts.setSecond(80);
		System.out.println(ts.getHour()+":"+ts.getMinute()+":"+ts.getSecond());
		
		ts.setMinute(60);
		ts.setSecond(12);
		System.out.println(ts.getHour()+":"+ts.getMinute()+":"+ts.getSecond());

	}

}
