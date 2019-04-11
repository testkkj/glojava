package extra.chap11_03_reflect;

import java.lang.reflect.*;

import example.chap11_06_03.Action;

public class NewInstanceExample {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("extra.chap11_03_reflect.SendAction");
		
		//매개변수가 있는 생성자 호출시 리플렉션으로 Constructor 객체를 얻어 newInstance() 메소드 호출
		Constructor cs = clazz.getDeclaredConstructor(String.class);	//매개변수(parameterType)
		
		cs.setAccessible(true);	//생성자의 접근제한자가 private일 경우 사용(IllegalAccessException 발생 차단)
		
		Action action = (Action) cs.newInstance("hong");
		action.execute();
	}
}