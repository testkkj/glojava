package temp;

import java.io.FileReader;
import java.io.Reader;

public class readExample2 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test.txt");
		int readCharNo;
		char[] cbuf = new char[2];
		String data = "";
		while (true) {
			readCharNo = reader.read(cbuf);
			if (readCharNo == -1)
				break;
			data += new String(cbuf, 0, readCharNo);

		}
		System.out.println(data);
		reader.close();

	}

}
