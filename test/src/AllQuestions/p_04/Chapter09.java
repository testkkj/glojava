package AllQuestions.p_04;

public class Chapter09 {
	
	public static void main(String[] args) {
		Window w = new Window();
		
		w.button1.touch();
		w.button2.touch();
	}

}

class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}
}

class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
			
		}
	};
	
	Window() {
		button1.setOnClickListener(listener);
		
		
	}
}
