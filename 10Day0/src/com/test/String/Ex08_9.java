package com.test.String;

public class Ex08_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 오토 박싱
		int num = 10;	// 기본형 정수
		Integer num2 = num;	// 기본형 정수를 객체로 변환해서 저장
		
		// 비교 연산자 가능
		System.out.println(num == num2);	// 자동 언박싱 중(객체가 기본형 정수로)
		
		// 언박싱
		Integer num3 = new Integer(200);
		int num4 = num3;	// 객체를 기본형 정수로 변환해서 저장
		
		System.out.println(num3 > 100);	
		// 객체를 기본형 정수로 변환(언박싱)해서 비교 중
		
		// 각각 객체로 자동 변환되어 저장
		Object [] obj = {10, "홍길동", 3.14, true, 'A'};
	}

}
