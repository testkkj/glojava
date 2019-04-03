package example.chap09_05_02;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	//필드 초기값으로 대입
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
			
		}
	};
	
	Window() {
		button1.setOnClickListener(listener);//매가값으로 필드 대입
		
	}

}
