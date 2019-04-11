package extra.chap11_03_reflect;

import java.lang.reflect.*;

import example.chap11_06_03.Action;

public class NewInstanceExample {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("extra.chap11_03_reflect.SendAction");
		
		//�Ű������� �ִ� ������ ȣ��� ���÷������� Constructor ��ü�� ��� newInstance() �޼ҵ� ȣ��
		Constructor cs = clazz.getDeclaredConstructor(String.class);	//�Ű�����(parameterType)
		
		cs.setAccessible(true);	//�������� ���������ڰ� private�� ��� ���(IllegalAccessException �߻� ����)
		
		Action action = (Action) cs.newInstance("hong");
		action.execute();
	}
}