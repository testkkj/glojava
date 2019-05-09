package example.chap13_02;

public class BoxExample {

	public static void main(String[] args) {
//		Box box = new Box();
//		box.set("ȫ�浿");
//		String name = (String) box.get();
//
//		box.set(new Apple());
//		Apple apple = (Apple) box.get();
//
//		System.out.println(name);
//		System.out.println(apple);
		Box<String> box1 = new Box<String>();
		box1.set("Hello");
		String str = box1.get();
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);
		int value = box2.get();
		
		System.out.println(str);
		System.out.println(value);

	}

}
