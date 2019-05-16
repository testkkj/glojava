package temp;

import java.io.FileWriter;
import java.io.Writer;

public class writeExample1 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test.txt");
		char[] data = "ȫ�浿".toCharArray();
		writer.write(data, 0, 3);
		writer.flush();
		writer.close();

	}

}
