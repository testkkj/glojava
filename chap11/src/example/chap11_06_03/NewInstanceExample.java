package example.chap11_06_03;

public class NewInstanceExample {

	public static void main(String[] args) {
		try {
			//Class clazz = Class.forName("example.chap11_06_03.SendAction");
			Class clazz = Class.forName("example.chap11_06_03.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch (ClassNotFoundException|InstantiationException|IllegalAccessException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
