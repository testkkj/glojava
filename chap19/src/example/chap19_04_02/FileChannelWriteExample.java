package example.chap19_04_02;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelWriteExample {

	public static void main(String[] args) throws Exception {
		Path path = Paths.get("C:/Temp/file.txt");
		Files.createDirectories(path.getParent());

		FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

		String data = "�ȳ��ϼ���.";
		Charset charset = Charset.defaultCharset();
		ByteBuffer byteBuffer = charset.encode(data);

		int byteCount = fileChannel.write(byteBuffer);
		System.out.println("file.txt : " + byteCount + "bytes written");

		fileChannel.close();

	}

}
