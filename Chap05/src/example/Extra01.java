package example;

public class Extra01 {

	public static void main(String[] args) {
		
		//1¹ø
		/*int[] arr1 = { 10, 20, 30, 40, 50 };
		
		int[] arr2 = new int[8];
		int[] arr3 = new int[8];
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		}
		
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}
		
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] = " + arr3[i]);
		}*/
		
		//2¹ø
		/*int[] array1 = { 98, 53, 78, 92, 65, 84 };
		
		int max = array1[0];
		int min = array1[0];
		
		
		for (int i = 0; i < array1.length; i++) {
			
			if (max < array1[i]) {
				max = array1[i];
			} else if (min > array1[i]) {
				min = array1[i];
			}
			
		}
		System.out.println("max = " + max + "\n" + "min = " + min);*/
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		String strNum3 = args[2];
		
		System.out.println("args[0]" + "=" + strNum1);
		System.out.println("args[1]" + "=" + strNum2);
		System.out.println("args[2]" + "=" + strNum3);

	}

}
