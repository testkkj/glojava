package example.sec13.exam03_field_method_access.package2;

import Example.sec13.exam03_field_method_access.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;	//(o)
		//a.field2 = 1;	//(x)	//default �޼ҵ� ���� �Ұ�(������ ����)
		//a.field3 = 1;	//(x)	//private �޼ҵ� ���� �Ұ�(������ ����)
		
		a.method1();	//(o)
		//a.method2();	//(x)	//default �޼ҵ� ���� �Ұ�(������ ����)
		//a.method3();	//(x)	//private �޼ҵ� ���� �Ұ�(������ ����)
		}

}
