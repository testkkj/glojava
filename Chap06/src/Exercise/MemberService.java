package Exercise;

public class MemberService {
	String id = "hong";
	String password = "12345";
	
	boolean login(String id, String password){
		if(this.id == id && this.password == password) {
			return true;			
		} else {
			return false;
		}

	}
	
	void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
