package example.chap7_3;

public class Student extends People{
	public int StudentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.StudentNo = studentNo;
	}

}
