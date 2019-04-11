package example.chap11_09;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();	//StringBuilder ��ü ����
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb);
		
		sb.insert(4, "2");
		System.out.println(sb);
		
		sb.setCharAt(4, '6');	//ū����ǥ �ȵ�
		System.out.println(sb);
		
		sb.replace(6, 13, "Book");
		System.out.println(sb);
		
		sb.delete(4, 5);
		System.out.println(sb);
		
		int length = sb.length();
		System.out.println("�ѹ��ڼ�: "+length);
		
		String result = sb.toString();
		System.out.println(result);

	}

}
