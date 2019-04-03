package example.chap09_04;

public class Button {
	OnClickListener listener;	//�������̽� Ÿ�� �ʵ�
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
		/*�Ű� ������ ������*/
	}
	
	void touch() {
		listener.onClick();	//���� ��ü�� onClick() �޼ҵ� ȣ��
	}
	
	interface OnClickListener {
		void onClick();
	}

}
