package example.chap11_03_01;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) { // �Ű����� Member Ÿ������ Ȯ��
			Member member = (Member) obj; // member Ÿ������ ���� Ÿ�� ��ȯ�ϰ� id�ʵ尪�� �������� �˻��� ��, �����ϸ� true�� ����
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false; // �Ű����� Member Ÿ���� �ƴϰų� id �ʵ� ���� �ٸ� ��� false�� ����
	}

}
