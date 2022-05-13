package com.test;

class Counter2{
	
	static int count;
	int num;
	public Counter2() {
		count++;
		num = count;
	}
	
	public int getNum() {
		return num;}
	
	public static int getCount() {
		return count;}	// 멤버변수 사용 불가(num 사용 안 됨)
}


public class Ex05_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("객체생성 횟수 : " + Counter2.getCount());	// static이기 때문에 객체 생성 전 호출 가능
		Counter2 c = new Counter2();
		System.out.println("객체생성 횟수 : " + c.getNum());			// getNum은 참조변수로 접근
		Counter2 c2 = new Counter2();
		System.out.println("객체생성 횟수 : " + Counter2.getCount());	// getCount는 static함수이기 때문에 클래스명으로 접근해야 함
		
	}

}
