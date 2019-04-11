package example.chap11_03_04;

import java.util.Arrays;

public class Memberdc implements Cloneable{
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Memberdc(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//먼저 얕은 복사를 해서 name, age를 복사한다.
		Memberdc cloned = (Memberdc) super.clone();//(super는 Object의 clone()을 호출)
		//scores를 깊은 복제한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//Car를 깊은 복제한다.
		cloned.car = new Car(this.car.model);
		//깊은 복제된 Member 객체를 리턴
		return cloned;
	}
	
	public Memberdc getMember() {
		Memberdc cloned = null;
		try {
			cloned = (Memberdc) clone();
		} catch (CloneNotSupportedException e) {
			
		}
		return cloned;
	}

}
