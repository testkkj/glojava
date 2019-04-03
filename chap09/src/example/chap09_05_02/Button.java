package example.chap09_05_02;

public class Button {
	OnClickListener listener;	//�������̽� Ÿ�� �ʵ�
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
		//�Ű� ������ ������
	}
	
	void touch() {
		listener.onClick();
		//���� ��ü�� onClick() �޼ҵ� ȣ��
	}
	
	interface OnClickListener {
		void onClick();
		//��ø �������̽�
	}

}
