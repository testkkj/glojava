package extra.chap11_02_clone.v2DC;

public class DeepClone_Test {

	public static void main(String[] args) {
		DeepClone tc = new DeepClone(1, new int[] {10,20,30});
		
		//복제객체 cloned를 얻음
		DeepClone cloned=null;
		try {
			cloned=tc.copy();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		//복제한 필드가 기본타입일 경우, 원본객체의 필드값은 변경되지 않는다.
		cloned.i = 80;
		System.out.println("원본객체: "+tc.i);
		System.out.println("복제객체: "+cloned.i);
		
		System.out.println();
		
		//복제객체의 arr값 변경
		//복제한 필드가 참조타입일 경우, 원본객체도 변경된 객체를 가지게 된다.
		cloned.arr[0]=99;
		System.out.println("원본객체: "+tc.arr[0]);
		System.out.println("복제객체: "+cloned.arr[0]);
		
		//원본객체와 복제객체의 arr은 같은 참조객체
		System.out.println(cloned.arr.hashCode());
		System.out.println(tc.arr.hashCode());

	}

}
