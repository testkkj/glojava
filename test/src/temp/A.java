package temp;

public class A {

	public static void main(String[] args) {
		int fac = 1;
		for(int a=1; a<=5; a++) {
			fac = fac*a;
		}
		
		double bun = 0;
		for(int a1=1; a1<=5; a1++) {
			bun = bun+1.0/a1;
		}
		
		double bunj = 1.0;
		for(double a1=1.0; a1<=5; a1++) {
			bunj = bunj+a1/(a1+1);
		}
		
		int an=0;
		int esum = 0;
		int osum = 0;
		for(int i=0; i<=10; i++) {
			int sum = 0;
			sum = sum+i;
			
			if(sum%2==0) {
				esum=esum+sum;
			}else if(sum%2!=0) {
				osum=osum+sum;
			}
		}
		an=esum-osum;
		System.out.println(bun);
		System.out.println(bunj);
		System.out.println(an);
		System.out.println(fac);

	}

}
