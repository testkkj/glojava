package extra.chap11_04_regexp;

public class StringTokenExample2 {

	public static void main(String[] args) {
		String st = "가:나:다:가나다";
		String[] str = st.split(":");
		for(String s : str) {
			System.out.println(s);
		}
		
		st = "가.나.다.가나다";
		str = st.split("\\.");	//split(".") 하면 모든 문자 빠짐, \.은 존재하는 이스케이프 시퀀스가 아니므로 \를 더 써줘야 함
		for(String s : str) {
			System.out.println(s);
		}
		
		st = "가	나	다";
		str = st.split("\t");
		for(String s : str) {
			System.out.println(s);
		}
		
		st = "welcom to split word";
		for(int i=0; i<5; i++) {
			System.out.println("---limit---"+i);
			str = st.split("\\s",i);
			for(String s : str) {
				System.out.println(s);
			}
		}

	}

}
