package com.test;

public class Ex05_12_1 {

	public static void change(int num) {
		num = 20;
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		int num = 10;
		System.out.println("change 함수 호출 전 num = " +num);
		change(num);
		System.out.println("change 함수 호출 후 num = " +num);
		Ex05_12_1.change(num);
	}
}
