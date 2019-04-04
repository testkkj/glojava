package example.chap10_02_04;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);

	}
	
	public static void changeDog(Animal animal) {
		try {
			Dog dog = (Dog) animal;
		} catch (ClassCastException e) {
			System.out.println("형변환 검사를 해주세요.");
		} finally {
			if (animal instanceof Dog) {
				Dog dog = (Dog) animal;
			}
		}
	}
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}