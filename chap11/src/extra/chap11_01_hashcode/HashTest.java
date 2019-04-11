package extra.chap11_01_hashcode;

import java.util.HashSet;
import java.util.Set;

import extra.chap11_01_hashcode.v2.Member;

public class HashTest {

	public static void main(String[] args) {
		Member m1 = new Member("1", "ȫ�浿");
		Member m2 = new Member("1", "ȫ�浿");
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		
		Set<Member> hset = new HashSet<>();
		
		hset.add(m1);
		hset.add(m2);
		
		System.out.println(hset.size());

	}

}
