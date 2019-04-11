package extra.chap11_05_arrays;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthSliderUI;

public class Asc_Desc {

	public static void main(String[] args) {
		Member m1 = new Member("¯��");
		Member m2 = new Member("��");
		Member m3 = new Member("�Ѹ�");
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
	// } //�Ϲ����� �������� ����

	@Override
	public int compareTo(Member o) {
		if (name.compareTo(o.name) < 0) {
			return 1;
		} else if (name.compareTo(o.name) == 0) {
			return 0;
		}
		return -1;
	} // �������� ���� ��

}
