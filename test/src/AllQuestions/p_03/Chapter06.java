package AllQuestions.p_03;

public class Chapter06 {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		System.out.println(car1 == car2);
		System.out.println(car1.company == car2.company);
		System.out.println(car1.company.equals(car2.company));

	}

}

class Car {

	String company = "kia";

	
}
