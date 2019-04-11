package AllQuestions.p_04;

public class Chapter05 {

	public static void main(String[] args) {
		int[][] arr = new int[][] {{1},{2,3,4,5},{6,7},{8,9,10,11,12},{13,14,15}};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
				if(j==arr[i].length-1) {
					System.out.println();
				}
			}
		}

	}

}
