package example.chap11_05_03;

public class SystemTimeExample {

	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		int sum=0;
		for(int i=0; i<=1000000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1~inma까지의 합: "+sum);
		System.out.println("계산에"+(time2-time1)+"나노초가 소요되었습니다.");

	}

}
