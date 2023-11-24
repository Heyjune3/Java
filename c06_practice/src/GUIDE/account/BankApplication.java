 package GUIDE.account;

import java.util.Scanner;

public class BankApplication {
	
	Account[] account = new Account[100];
	
	Scanner sc = new Scanner(System.in);
	
	BankApplication(){
		run();
	}
	
	void run() {
		// 1. 계좌생성
		// 2. 계좌조회 
		// 3. 예금
		// 4. 출금
		// 5. 종료
		boolean isRun = true;
		
		while(isRun) {
			System.out.println("========================================");
			System.out.println("1.계좌생성 2.계좌조회 3.예금 4.출금 5.종료");
			System.out.println("========================================");
			
			int selectNo = sc.nextInt();
			if(selectNo == 1) {
				// 계좌생성
				createAccount();
			}else if(selectNo ==2) {
				// 계좌조회
				selectAccount();
			}else if(selectNo ==3) {
				// 예금
				deposit();
			}else if(selectNo ==4) {
				// 출금
				withdraw();
			}else if(selectNo ==5) {
				// 종료
				isRun = false;
				sc.close();
			}
		}
		System.out.println("프로그램 종료");
	}
	
	
	//계좌생성
	void createAccount() {
		System.out.println("------------------");
		System.out.println("계좌생성");
		System.out.println("------------------");
		System.out.println("계좌번호를 입력해주세요.");
		String ano = sc.next();
		System.out.println("계좌주의 성함을 입력해주세요.");
		String owner = sc.next();
		System.out.println("초기입금액을 입력해주세요.");
		int balance = sc.nextInt();
		System.out.println("비밀번호를 입력해주세요.");
		String password = sc.next();
		
		Account myAccount = new Account(ano, owner, balance, password);
		for(int i = 0; i < account.length; i++) {
			account[i] = myAccount;
			break;
		}
		System.out.println("계좌주: " + owner);
		System.out.println("계좌번호: " + ano);
		System.out.println("초기입금액: " + balance);
		System.out.println("비밀번호: " + password);
		System.out.println("계좌생성이 완료되었습니다.");
		
		
	}
	// 계좌조회
	void selectAccount() {
		System.out.println("------------------");
		System.out.println("계좌목록");
		System.out.println("------------------");
		System.out.println("조회하고자 하는 계좌번호를 입력해주세요.");
		String ano = sc.next();
		System.out.println("조회하고자 하는 비밀번호를 입력해주세요.");
		String password = sc.next();
		
		System.out.println("계좌번호: " + ano);
		System.out.println("비밀번호: " + password);
		for(Account a : account) {
		System.out.println(a.toString());
		}
	}
	
	// 예금
	void deposit() {
		
	}
	//출금
	void withdraw() {
		
	}
	
	// 계좌번호와 비밀번호가 일치하는 Account 객체를 찾아서 반환 
	Account findAccount(String ano, String password) {
		for(int i = 0; i < account.length; i++) {
			if(account[i].ano.equals(ano) && account[i].password.equals(password)) {
				return account[i];
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		new BankApplication();
	}
}
