package example.chap11_08_02;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		String text1 = "홍길동&이수홍/박연수,김이박--이박김/,박김이";
		
		//how1: 전체 토큰 수를 얻어 for 문으로 루핑
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		//how2: 남아 있는 토큰을 확인하고 while 문으로 루핑
		st = new StringTokenizer(text1, "&/,-");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}
