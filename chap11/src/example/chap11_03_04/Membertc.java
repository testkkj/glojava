package example.chap11_03_04;

public class Membertc implements Cloneable{
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Membertc(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Membertc getMember() {
		Membertc cloned = null;
		try {
			cloned = (Membertc) clone();
		} catch (CloneNotSupportedException e) {
			
		}
		return cloned;
	}

}
