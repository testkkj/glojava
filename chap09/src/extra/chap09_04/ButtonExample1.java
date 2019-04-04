package extra.chap09_04;

public class ButtonExample1 {

	public static void main(String[] args) {
		//인터페이스타입의 매개변수
		Button btn = new Button();
		
		btn.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("전화걸다.");
				
			}
		});
		btn.touch();
		
		btn.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("문자보내다.");
				
			}
		});
		btn.touch();

	}

}
