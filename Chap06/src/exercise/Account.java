package Exercise;

public class Account {
	int balance = 0;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(0<=balance && balance<=1000000) {
		this.balance = balance;
		} else {
			balance = 0;
		}
	}
	
	

}
