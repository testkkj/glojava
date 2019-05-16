package example.chap19_04_03;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesCopyMethodExample {

	public static void main(String[] args) throws Exception {
		Path from = Paths.get("C:/JavaProgramming/source/chap19/src/sec04/exam02_file_copy/house1.jpg");
		Path to = Paths.get("C:/JavaProgramming/source/chap19/src/sec04/exam02_file_copy/house2.jpg");

		Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("파일 복사 성공");

	}

}
