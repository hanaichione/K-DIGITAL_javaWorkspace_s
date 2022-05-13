package com.test.String;

public class Ex08_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Hello");
		String str2 = new String("Hello");	// str2과 주소 다름
		String str3 = "Hello";
		String str4 = "Hello";	// str3과 주소 같음
		
		System.out.println(str == str2);
		System.out.println(str3 == str4);
		
		if (str.equals(str2)) System.out.println("str과 str2는 같다.");
		if (str3.equals(str4)) System.out.println("str3과 str4는 같다.");
		
		String test="1";
		System.out.println(test+"2");	// 문자열은 불변이기 때문에 2를 붙여도 12가 되지 않음
		System.out.println(test);
		test = test+"2";
		System.out.println(test);
	}

}
