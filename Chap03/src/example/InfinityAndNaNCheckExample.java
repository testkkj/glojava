package example;

public class InfinityAndNanCheckExample {

	public static void main(String[] args) {
		
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
		//double z = x % y;
		
		System.out.println(Double.isFinite(z));
		System.out.println(Double.isNaN(z));
		
		System.out.println(z + 2);	//������ �Ǵ� �ڵ�

	}

}
