package extra.chap11_01_hashcode;

public class EqualsAndHashCode {

	public static void main(String[] args) {
		Object obj = new Object();
		Object obj0 = new Object();
		Object obj2 = new Object();
		boolean result1 = obj0.equals(obj2);
		boolean result2 = (obj0==obj2);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(obj.hashCode());
		System.out.println(obj0.hashCode()+"\n"+obj2.hashCode());
		
		String s1 = "ȫ�浿";
		String s2 = "ȫ�浿";
		String s3 = new String("ȫ�浿");
		String s4 = new String("ȫ���");
		boolean result3 = s1.equals(s2);
		boolean result4 = s1.equals(s3);
		boolean result5 = s1.equals(s4);
		boolean result6 = (s3==s4);
		
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(s1.hashCode()+"\n"+s2.hashCode()+"\n"+s3.hashCode()+"\n"+s4.hashCode());

	}

}
