package example.sec13.exam03_field_method_access.package1;

public class B {
	public B() {
	A a = new A();
	a.field1 = 1;	//(o)
	a.field2 = 1;	//(o)
	//a.field3 = 1;	//(x)	//private �޼ҵ� ���� �Ұ�(������ ����)
	
	a.method1();	//(o)
	a.method2();	//(o)
	//a.method3();	//(x)	//private �޼ҵ� ���� �Ұ�(������ ����)
	}

}
