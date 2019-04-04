package extra.chap09_01;

public class OnClickExample {
	
	public static void main(String[] args) {
		OnClickListener call = new OnClickListener() {

			@Override
			public void onClick() {
				System.out.println("전화걸다.");
				
			}
			
		};
		
		OnClickListener message = new OnClickListener() {

			@Override
			public void onClick() {
				System.out.println("문자보내다.");
				
			}
			
		};
		call.onClick();
		message.onClick();
	}

}
