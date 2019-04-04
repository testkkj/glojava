package example.chap10_07_02;

import example.chap10_07_01.BalanceInsufficientException;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException {//����� ���� ���� ���ѱ��
		if(balance < money) {
			throw new BalanceInsufficientException("�ܰ����:"+(money-balance)+"���ڶ�");
			//����� ���� ���� �߻�
		}
		balance -= money;
	}

}
