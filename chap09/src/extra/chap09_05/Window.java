package extra.chap09_05;

public class Window {
	Button btn1 = new Button();
	Button btn2 = new Button();
	
	Button.OnClickListener listener = new Button.OnClickListener() {

		@Override
		public void onClick() {
			System.out.println("��ȭ�ɴ�.");
			
		}
		
	};
	
	public Window() {
		btn1.setOnClickListener(listener);
		btn2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("���ں�����.");
				
			}
		});
	}

}
