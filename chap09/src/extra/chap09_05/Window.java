package extra.chap09_05;

public class Window {
	Button btn1 = new Button();
	Button btn2 = new Button();
	
	Button.OnClickListener listener = new Button.OnClickListener() {

		@Override
		public void onClick() {
			System.out.println("전화걸다.");
			
		}
		
	};
	
	public Window() {
		btn1.setOnClickListener(listener);
		btn2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("문자보내다.");
				
			}
		});
	}

}
