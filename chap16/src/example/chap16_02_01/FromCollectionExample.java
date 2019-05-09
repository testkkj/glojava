package example.chap16_02_01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import example.chap16_01_02.Student;

public class FromCollectionExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("ȫ�浿", 10),
				new Student("�ſ��", 20),
				new Student("���̼�", 30));

		Stream<Student> stream = studentList.stream();
		stream.forEach(s -> System.out.println(s.getName()));

	}

}
