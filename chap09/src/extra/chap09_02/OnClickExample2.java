package extra.chap09_02;

public class OnClickExample2 {

	public static void main(String[] args) {
		OnClickListener call = new Call();
		call.onClick();
		
		OnClickListener message = new Message();
		message.onClick();

	}

}
