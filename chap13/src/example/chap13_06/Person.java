package example.chap13_06;

public class Person {
	String str;

	public Person(String string) {
		this.str = string;
	}

	public String getStr() {
		return str;
	}
	
	@Override
	public String toString() {
		return str;
	}
}