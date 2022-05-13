package com.test.String;

public class Ex08_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 기본형을 Wrapper로 변경
		int num =10;
		Integer x = new Integer(num);
		// 1.5 버전이면 에러 => 1.5 버전 이후 객체 x를 자동으로 int로 변경, 자동 언박싱
		int sum = x + 1;	
		// int sum = x.intValue()+1;
		System.out.println(x);
		System.out.println(sum);
		
		// 2. Wrapper을 기본형으로 변경
		int x2 = x.intValue();
		System.out.println(x2);
		
		// 1.5 버전 이후 기본형 변수 10을 자동으로 Integer 객체로 변경, 자동 박싱
		Integer x3 = 10;	
		System.out.println(x+x2);	// Integer 10과 기본형 10을 더함
		
		Object i [] = new Object [3];
		i[0] = 10;				// 자동 박싱, Integer 10 을 넣고 있음
		i[1] = new Integer(20);	// 예전 방식
	}

}
