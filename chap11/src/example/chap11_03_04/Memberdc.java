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
		//���� ���� ���縦 �ؼ� name, age�� �����Ѵ�.
		Memberdc cloned = (Memberdc) super.clone();//(super�� Object�� clone()�� ȣ��)
		//scores�� ���� �����Ѵ�.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//Car�� ���� �����Ѵ�.
		cloned.car = new Car(this.car.model);
		//���� ������ Member ��ü�� ����
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
