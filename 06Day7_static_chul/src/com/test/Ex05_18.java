package com.test;

class Counter{
	int count;	// static 붙이지 않으면 매번 객체마다 count 변수가 따로 만들어짐(공유 안 됨)
	int num;
	public Counter() {
		count++;
		num = count;
	}
	public int getNum() {
		return num;
	};
}


public class Ex05_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("객체생성 횟수 : " + Counter.count);
		Counter c = new Counter();		// 생성자 호출되며 count++ 실행, count == 1
		System.out.println("객체생성 횟수 : " + c.getNum());
		Counter c2 = new Counter();
		System.out.println("객체생성 횟수 : " + c2.getNum());	// c2가 참조하는 count가 새로 만들어지므로 count == 1
		
	}

}
