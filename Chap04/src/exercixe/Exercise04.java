package exercixe;

public class Exercise04 {

	public static void main(String[] args) {
		
		int done, dtwo;
		
		while (true) {
			
			done = (int)(Math.random()*6) + 1;
			dtwo = (int)(Math.random()*6) + 1;
			int dice = done + dtwo;
			
			System.out.println("(" + done + "," + dtwo + ")");
			
			if (dice == 5) {
				break;
			}
			
		}

	}

}
