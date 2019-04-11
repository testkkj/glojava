package extra.chap11_03_reflect;

import java.lang.reflect.*;

import example.chap11_06_03.Action;

public class NewInstanceExample2 {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName(args[0]);
			Constructor cs = clazz.getDeclaredConstructor(String.class);
			cs.setAccessible(true);
			Action action = (Action) cs.newInstance("hong");
			action.execute();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
