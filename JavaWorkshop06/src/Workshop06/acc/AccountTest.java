package Workshop06.acc;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		Account account = new Account("441-0290-1203", 500000, 7.3);
//		System.out.println("계좌정보: "+account.getAccount()+" 현재잔액: "+account.getBalance());
//		
//		account.withdraw(600000);
//		
//		account.deposit(20000);
//		
//		System.out.println("계좌정보: "+account.getAccount()+" 현재잔액: "+account.getBalance());
//		
//		System.out.println("이자: "+account.calculateInterest());
		
		while(true) {
			System.out.println("계좌정보: "+account.getAccount()+" 현재잔액: "+account.getBalance());
			System.out.print("출금할 금액을 입력하세요: ");
			int with = scan.nextInt();
			try {
				account.withdraw(with);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			
			System.out.print("입금할 금액을 입력하세요: ");
			int dep = scan.nextInt();
			try {
				account.deposit(dep);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			System.out.println("이자: "+account.calculateInterest());
			System.out.print("atm 서비스를 종료하기를 원하신다면 true를 입력해주세요.");
			boolean end = scan.nextBoolean();
			if (end == true) break;
			else continue;
		}
		
		System.out.println("atm 서비스를 종료합니다.");
	}
}
