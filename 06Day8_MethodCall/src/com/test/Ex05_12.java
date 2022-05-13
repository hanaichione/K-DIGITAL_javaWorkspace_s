package com.test;

public class Ex05_12 {

	public void change(int num) {
		num=20;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex05_12 t = new Ex05_12();
		// static 이 아니므로 객체 생성 해줘야 함
		int num = 10;
		System.out.println("change 함수 호출 전 num = " + num);
		t.change(num);
		System.out.println("change 함수 호출 후 num = " + num);
	}

}
