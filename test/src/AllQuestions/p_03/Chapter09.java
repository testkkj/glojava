package AllQuestions.p_03;

public class Chapter09 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		for(int i=5; i>0; i--) {
			try {
				Question.method(i);
				a++;
			} catch(GyooException e) {
				b++;
			} catch(Exception e) {
				c++;
			} finally {
				d++;
			}
		}
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		System.out.println("d: "+d);
	}
}

class Question extends Exception {
	public static void method(int i) throws Exception {
		if(i%2 == 0) {
			throw new GyooException();
		} else {
			throw new Exception();
		}
	}
}

class GyooException extends Exception {
	
}