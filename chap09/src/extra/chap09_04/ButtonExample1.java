package extra.chap09_04;

public class ButtonExample1 {

	public static void main(String[] args) {
		//�������̽�Ÿ���� �Ű�����
		Button btn = new Button();
		
		btn.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("��ȭ�ɴ�.");
				
			}
		});
		btn.touch();
		
		btn.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("���ں�����.");
				
			}
		});
		btn.touch();

	}

}
