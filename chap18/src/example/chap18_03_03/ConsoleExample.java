package example.chap18_03_03;

import java.io.Console;

public class ConsoleExample {

	public static void main(String[] args) {
		Console console = System.console();

		System.out.println("아이디");
		String id = console.readLine();

		System.out.println("비번");
		char[] charpw = console.readPassword();
		String strpw = new String(charpw);

		System.out.println("-----------------");
		System.out.println(id);
		System.out.println(strpw);

	}

}
