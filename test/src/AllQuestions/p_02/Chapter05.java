package AllQuestions.p_02;

public class Chapter05 {
	
	public static void main(String[] args) {
		int[][] arr1 = {{10,20,30},{10,10,20}};
		
		//배열복사
		int[][] arr2 = new int[2][3];
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = arr1[i][j];
			}
		}
		
		//향상된 for문을 사용하여 복사된 배열의 그룹 1값 합 구하기
		int sum = 0;
		for(int[] arr : arr1) {
			for(int i=0; i<arr1.length; i++) {
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
	}
}