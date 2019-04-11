package extra.chap11_02_clone;

public class DeepCloneTest {

	public static void main(String[] args) {
		DeepClone dc = new DeepClone(1, new int[] {10,20,30});
		
		//������ü cloned�� ����
		DeepClone cloned = null;
		try {
			cloned = dc.copy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//������ �ʵ尡 �⺻Ÿ���� ���, ���� ��ü�� �ʵ尪�� ������� �ʴ´�.
		cloned.i = 80;
		System.out.println("������ü : "+dc.i);		//dc ���� ��ü
		System.out.println("������ü : "+cloned.i);		//cloned ���� ��ü
		
		System.out.println();
		
		//������ü�� arr�� ����
		//������ �ʵ尡 ����Ÿ���� ���, ������ü�� ����� ��ü�� ������ �ʰ� �ȴ�.
		cloned.arr[0] = 99;
		System.out.println("������ü : "+dc.arr[0]);		//dc ���� ��ü
		System.out.println("������ü : "+cloned.arr[0]);	//cloned ���� ��ü
		
		//������ü�� ������ü�� arr�� �ٸ� ������ü
		System.out.println(cloned.arr.hashCode());
		System.out.println(dc.arr.hashCode());

	}

}
