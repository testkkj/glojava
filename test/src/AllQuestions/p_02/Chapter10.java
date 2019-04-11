package AllQuestions.p_02;

public class Chapter10 {

	public static void main(String[] args) {
		String data1 = args[0];
		String data2 = args[1];
		try {
			int a = Integer.parseInt(data1);
			int b = Integer.parseInt(data2);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("다시실행하세요.");
		}

	}

}
