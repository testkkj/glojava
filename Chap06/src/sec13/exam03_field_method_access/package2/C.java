package sec13.exam03_field_method_access.package2;

import sec13.exam03_field_method_access.package1.*;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;	//(o)
		//a.field2 = 1;	//(x) defualt �ʵ� ���� �Ұ�(������ ����)
		//a.field3 = 1;	//(x) private �ʵ� ���� �Ұ�(������ ����)
		
		a.method1();	//(o)
		//a.method2();	//(x) defualt �޼ҵ� ���� �Ұ�(������ ����)
		//a.method3();	//(x) private �޼ҵ� ���� �Ұ�(������ ����)
	}

}
