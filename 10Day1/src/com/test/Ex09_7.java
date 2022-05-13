package com.test;

public class Ex09_7 {

	public static void check(int num) {
		try {
			if(num < 100) {
				throw new Exception("num 값이 100보다 작음");
			}
		} catch (Exception e) {
			System.out.println("check 함수에서 Exception 발생");
			System.out.println("check 함수 종료 =================");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("프로그램 시작");
		check(10);
		System.out.println("프로그램 정상 종료");
	}

}
