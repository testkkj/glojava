package extra.chap09_04;

public class ButtonExample {

	public static void main(String[] args) {
		//�������̽�Ÿ�� �ʵ� ����
		Button.OnClickListener call = new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("��ȭ�ɴ�.");
				
			}
		};
		
		Button.OnClickListener message = new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("���ں�����.");
				
			}
		};
		call.onClick();
		message.onClick();

	}

}
