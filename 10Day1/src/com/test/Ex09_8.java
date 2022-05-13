package com.test;

class UserException extends Exception {
	public UserException(String mesg) {
		super(mesg);
	}
}

public class Ex09_8 {

	public static void check(int num) throws Exception {

		if (num < 100) {
			throw new UserException("num 값이 100보다 작음");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("프로그램 시작");
		try {
			check(10);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외발생 : " + e.getMessage());
		}

		System.out.println("프로그램 정상 종료");
	}

}
