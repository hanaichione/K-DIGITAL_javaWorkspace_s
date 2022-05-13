package com.bank;

public class Bank {

	private String name;
	
	// 기본 생성자
//	private Bank() {}		// 싱글톤 디자인 1 : 생성자를 private으로 생성 못하게 제한
//	
//	// 클래스 내부에서 객체 생성
//	private static Bank b = new Bank();	// 싱글톤 디자인 2 : 클래스에 static 변수 선언 후 자체적 객체를 생성하고 지정
//	/// 자기 자신의 객체를 생성하여 b에 저장
//	/// private으로 막혀서 Bank.b 불가
//	
//	// 객체 접근할 수 있도록 함수 생성
//	public static Bank getBank() {			// 싱글톤 디자인 3 : 다른 클래스에서 받아가도록 static get 함수 작성
//		return b;	// return값이 Bank
//	}
	
	private Bank() {}
	private static Bank b = new Bank();
	
	public static Bank getBank() {return b;}	
	// 클래스를 반환하는 함수
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
