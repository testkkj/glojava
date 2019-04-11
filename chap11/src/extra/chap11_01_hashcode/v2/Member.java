package extra.chap11_01_hashcode.v2;

public class Member {
	public String id;
	public String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return id.hashCode()+name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member meber = (Member) obj;
			if(id.equals(meber.id) && name.equals(meber.name)) {
				return true;
			}
		}
		return false;
	}
	
	
}
