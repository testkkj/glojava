package extra.chap11_03_reflect;

import java.lang.reflect.*;

public class ReflectExample {

	public static void main(String[] args) throws Exception {
		Class cs = Class.forName("example.chap11_06_01.Car");
		System.out.println("클래스명 \n"+cs.getName());
		System.out.println();
		
		//생성자
		System.out.println("생성자 정보");
		Constructor[] cons = cs.getDeclaredConstructors();
		for(Constructor con : cons) {
			System.out.print(con.getName()+"(");
			Class[] parameter = con.getParameterTypes();
			for(Class css : parameter) {
				System.out.println(css.getSimpleName());
			}
			System.out.println(")");
		}
		System.out.println();
		
		//메소드 정보
		System.out.println("메소드 정보");
		Method[] md = cs.getDeclaredMethods();
		for(Method mdd : md) {
			System.out.print(mdd.getName()+"(");
			Class[] parameter = mdd.getParameterTypes();
			for(Class css:parameter) {
				System.out.print(css.getSimpleName());
			}
			System.out.println(")");
		}
		System.out.println();
		
		//필드 정보
		System.out.println("필드 정보");
		Field[] fields = cs.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getSimpleName()+" "+field.getName());
		}

	}

}
