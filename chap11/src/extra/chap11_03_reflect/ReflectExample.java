package extra.chap11_03_reflect;

import java.lang.reflect.*;

public class ReflectExample {

	public static void main(String[] args) throws Exception {
		Class cs = Class.forName("example.chap11_06_01.Car");
		System.out.println("Ŭ������ \n"+cs.getName());
		System.out.println();
		
		//������
		System.out.println("������ ����");
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
		
		//�޼ҵ� ����
		System.out.println("�޼ҵ� ����");
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
		
		//�ʵ� ����
		System.out.println("�ʵ� ����");
		Field[] fields = cs.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getSimpleName()+" "+field.getName());
		}

	}

}
