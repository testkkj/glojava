package Exercise;

import java.util.*;

public class BankApplication {
	private static Account1[] accountArray = new Account1[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("----------------------------------------");
			System.out.println("����>");
			
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
		System.out.println("���α׷� ����");
	}
	
	private static void createAccount() {
		System.out.println("-------");
		System.out.println("���»���");
		System.out.println("-------");
		System.out.println("���¹�ȣ: ");
		String j = scanner.next();
		System.out.println("������: ");
		String k = scanner.next();
		System.out.println("�ʱ��Աݾ�: ");
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
		System.out.println("���: ���°� �����Ǿ����ϴ�.");
		
	}
	
	private static void accountList() {
		System.out.println("-------");
		System.out.println("���¸��");
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
		System.out.println("����");
		System.out.println("-------");
		System.out.println("���¹�ȣ: ");
		String j = scanner.next();
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i].getAno().equals(j)) {
			System.out.println("���ݾ�: ");
			int l = scanner.nextInt();
			accountArray[i].setBalance(l+accountArray[i].getBalance());			
			break;
			}
		}
		System.out.println("���: ������ �����Ǿ����ϴ�.");
		
	}

	private static void withdraw() {
		System.out.println("-------");
		System.out.println("���");
		System.out.println("-------");
		System.out.println("���¹�ȣ: ");
		String j = scanner.next();
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i].getAno().equals(j)) {
			System.out.println("��ݾ�: ");
			int l = scanner.nextInt();
			accountArray[i].setBalance(accountArray[i].getBalance()-l);
			break;
			}
		}
		System.out.println("���: ����� �����Ǿ����ϴ�.");
		
	}
		
		
}