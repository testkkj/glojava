package extra.chap09_04;

public class ButtonExample {

	public static void main(String[] args) {
		//인터페이스타입 필드 선언
		Button.OnClickListener call = new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("전화걸다.");
				
			}
		};
		
		Button.OnClickListener message = new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("문자보내다.");
				
			}
		};
		call.onClick();
		message.onClick();

	}

}
