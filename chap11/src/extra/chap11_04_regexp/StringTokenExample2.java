package extra.chap11_04_regexp;

public class StringTokenExample2 {

	public static void main(String[] args) {
		String st = "��:��:��:������";
		String[] str = st.split(":");
		for(String s : str) {
			System.out.println(s);
		}
		
		st = "��.��.��.������";
		str = st.split("\\.");	//split(".") �ϸ� ��� ���� ����, \.�� �����ϴ� �̽������� �������� �ƴϹǷ� \�� �� ����� ��
		for(String s : str) {
			System.out.println(s);
		}
		
		st = "��	��	��";
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
