package extra.chap11_02_clone.v2DC;

public class DeepClone_Test {

	public static void main(String[] args) {
		DeepClone tc = new DeepClone(1, new int[] {10,20,30});
		
		//������ü cloned�� ����
		DeepClone cloned=null;
		try {
			cloned=tc.copy();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		//������ �ʵ尡 �⺻Ÿ���� ���, ������ü�� �ʵ尪�� ������� �ʴ´�.
		cloned.i = 80;
		System.out.println("������ü: "+tc.i);
		System.out.println("������ü: "+cloned.i);
		
		System.out.println();
		
		//������ü�� arr�� ����
		//������ �ʵ尡 ����Ÿ���� ���, ������ü�� ����� ��ü�� ������ �ȴ�.
		cloned.arr[0]=99;
		System.out.println("������ü: "+tc.arr[0]);
		System.out.println("������ü: "+cloned.arr[0]);
		
		//������ü�� ������ü�� arr�� ���� ������ü
		System.out.println(cloned.arr.hashCode());
		System.out.println(tc.arr.hashCode());

	}

}
