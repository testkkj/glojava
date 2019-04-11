package example.chap11_03_02;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() { // id�� ������ ���ڿ��� ��� ���� �ؽ� �ڵ带 ����
		return id.hashCode();
	}

}
