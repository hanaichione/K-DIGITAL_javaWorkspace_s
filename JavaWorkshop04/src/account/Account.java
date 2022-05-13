package account;

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
	
	public void deposit(int money) {
		this.balance += money;
		System.out.println("계좌정보: "+account+" 현재잔액: "+balance);
	}
	
	public void withdraw(int money) {
		if (balance>=money) this.balance -= money;
		else System.out.println("출금할 수 없습니다.");
	}
}
