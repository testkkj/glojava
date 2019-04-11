package extra.chap11_05_arrays;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthSliderUI;

public class Asc_Desc {

	public static void main(String[] args) {
		Member m1 = new Member("짱구");
		Member m2 = new Member("희동");
		Member m3 = new Member("둘리");
		Member[] member = { m1, m2, m3 };

		Arrays.sort(member);

		for (Member m : member) {
			System.out.println(m.name);
		}

	}

}

class Member implements Comparable<Member> {
	String name;

	public Member(String name) {
		this.name = name;
	}

	// @Override
	// public int compareTo(Member o) {
	//
	// return name.compareTo(o.name);
	// } //일반적인 오름차순 정렬

	@Override
	public int compareTo(Member o) {
		if (name.compareTo(o.name) < 0) {
			return 1;
		} else if (name.compareTo(o.name) == 0) {
			return 0;
		}
		return -1;
	} // 내림차순 정렬 법

}
