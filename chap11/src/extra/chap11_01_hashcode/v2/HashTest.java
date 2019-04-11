package extra.chap11_01_hashcode.v2;

import java.util.HashSet;
import java.util.Set;

public class HashTest {
	
	public static void main(String[] args) {
		Member m1 = new Member("one", "ȫ�浿");
		Member m2 = new Member("one", "ȫ�浿");
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		
		Set<Member> hset = new HashSet<>();
		
		hset.add(m1);
		hset.add(m2);
		
		System.out.println(hset.size());
	}

}
