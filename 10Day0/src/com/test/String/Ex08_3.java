package com.test.String;

public class Ex08_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer("Hello");
		s.append(" world");
		System.out.println(s);
		s.insert(5, "!!!");	// 5번째 자리에 문자열 삽입
		System.out.println(s);
		s.delete(0, 5);		// 0부터 5자리 앞까지 지우기
		System.out.println(s);
		
		String data = s.toString();	// 변경된 내용 문자열로 변경
		
		
	}

}
