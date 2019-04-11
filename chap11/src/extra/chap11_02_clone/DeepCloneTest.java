package extra.chap11_02_clone;

public class DeepCloneTest {

	public static void main(String[] args) {
		DeepClone dc = new DeepClone(1, new int[] {10,20,30});
		
		//복제객체 cloned를 얻음
		DeepClone cloned = null;
		try {
			cloned = dc.copy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//복제한 필드가 기본타입일 경우, 원본 객체의 필드값은 변경되지 않는다.
		cloned.i = 80;
		System.out.println("원본객체 : "+dc.i);		//dc 원본 객체
		System.out.println("복제객체 : "+cloned.i);		//cloned 복제 객체
		
		System.out.println();
		
		//복제객체의 arr값 변경
		//복제한 필드가 참조타입일 경우, 원본객체는 변경된 객체를 가지지 않게 된다.
		cloned.arr[0] = 99;
		System.out.println("원본객체 : "+dc.arr[0]);		//dc 원본 객체
		System.out.println("복제객체 : "+cloned.arr[0]);	//cloned 복제 객체
		
		//원복객체와 복제객체의 arr은 다른 참조객체
		System.out.println(cloned.arr.hashCode());
		System.out.println(dc.arr.hashCode());

	}

}
