package example.sec13.exam02_construct_access.package2;

import Example.sec13.exam02_construct_access.package1.A;

public class C {
	//�ʵ�
	A a1 = new A(true);		//(o)
	//A a2 = new A(1);		//(x)	default ������ ���� �Ұ�(������ ����)
	//A a3 = new A("���ڿ�");	//(x)	private ������ ���� �Ұ�(������ ����)

}
