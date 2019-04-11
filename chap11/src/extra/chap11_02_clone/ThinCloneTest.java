package extra.chap11_02_clone;

public class ThinCloneTest {

	public static void main(String[] args) {
		ThinClone tc = new ThinClone(1, new int[] {10,20,30});
		
		//������ü cloned�� ����
		ThinClone cloned = null;
		try {
			cloned = tc.copy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//������ �ʵ尡 �⺻Ÿ���� ���, ���� ��ü�� �ʵ尪�� ������� �ʴ´�.
		cloned.i = 80;
		System.out.println("������ü : "+tc.i);		//tc ���� ��ü
		System.out.println("������ü : "+cloned.i);		//cloned ���� ��ü
		
		System.out.println();
		
		//������ü�� arr�� ����
		//������ �ʵ尡 ����Ÿ���� ���, ������ü�� ����� ��ü�� ������ �ȴ�.
		cloned.arr[0] = 99;
		System.out.println("������ü : "+tc.arr[0]);		//tc ���� ��ü
		System.out.println("������ü : "+cloned.arr[0]);	//cloned ���� ��ü
		
		//������ü�� ������ü�� arr�� ���� ������ü
		System.out.println(cloned.arr.hashCode());
		System.out.println(tc.arr.hashCode());

	}

}
