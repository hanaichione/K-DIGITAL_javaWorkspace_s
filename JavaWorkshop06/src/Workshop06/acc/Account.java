package Workshop06.acc;

import javax.security.auth.login.AccountException;

public class Account {
	
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String account, int balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		return (double)balance*(interestRate/100);
	}
	
	public void deposit(int money) throws AccountException {
		if (money <= 0) {
			throw new AccountException("입금 금액은 0보다 커야 합니다.");
		}
		this.balance += money;
		System.out.println("계좌정보: "+account+" 현재잔액: "+balance);
	}
	
	public void withdraw(int money) throws AccountException {
		if (balance>=money && money >= 0) this.balance -= money;
		else {
			throw new AccountException("금액이 0보다 작거나 현재 잔액보다 많습니다.");
		}
	}
}
