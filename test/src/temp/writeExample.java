package temp;

import java.io.FileOutputStream;

import org.omg.CORBA.portable.OutputStream;

public class writeExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "ABC".getBytes();
		os.write(data);
		os.flush();
		os.close();

	}

}
