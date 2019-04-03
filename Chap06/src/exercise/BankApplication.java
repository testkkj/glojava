package Exercise;

import java.util.*;

public class BankApplication {
	private static Account1[] accountArray = new Account1[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------");
			System.out.println("선택>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	private static void createAccount() {
		System.out.println("-------");
		System.out.println("계좌생성");
		System.out.println("-------");
		System.out.println("계좌번호: ");
		String j = scanner.next();
		System.out.println("계좌주: ");
		String k = scanner.next();
		System.out.println("초기입금액: ");
		int l = scanner.nextInt();
		Account1 account1 = new Account1(j, k, l);	
		for(int i=0; i<accountArray.length; i++) {		
			if(accountArray[i] == null) {
				accountArray[i] = account1;
				break;
			} else if(accountArray[i+1] == null) {
				continue;
			} 
		}
		System.out.println("결과: 계좌가 생성되었습니다.");
		
	}
	
	private static void accountList() {
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				System.out.println(accountArray[i].getAno()+" "+accountArray[i].getOwner()+" "+accountArray[i].getBalance());
			} else if(accountArray[i] == null) {
				break;
			}
		}
		
	}
	
	private static void deposit() {
		System.out.println("-------");
		System.out.println("예금");
		System.out.println("-------");
		System.out.println("계좌번호: ");
		String j = scanner.next();
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i].getAno().equals(j)) {
			System.out.println("예금액: ");
			int l = scanner.nextInt();
			accountArray[i].setBalance(l+accountArray[i].getBalance());			
			break;
			}
		}
		System.out.println("결과: 예금이 성공되었습니다.");
		
	}

	private static void withdraw() {
		System.out.println("-------");
		System.out.println("출금");
		System.out.println("-------");
		System.out.println("계좌번호: ");
		String j = scanner.next();
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i].getAno().equals(j)) {
			System.out.println("출금액: ");
			int l = scanner.nextInt();
			accountArray[i].setBalance(accountArray[i].getBalance()-l);
			break;
			}
		}
		System.out.println("결과: 출금이 성공되었습니다.");
		
	}
		
		
}