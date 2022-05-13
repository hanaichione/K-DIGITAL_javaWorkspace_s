package com.test;

class Outer {
	int a = 10;
	private int b = 20;
	static int c = 30;

	class Inner {
		int d = 40;

		public void print() {
			System.out.println(a);
			System.out.println(b); // private 변수 사용 가능, class 블럭 내에 있으므로
			System.out.println(c);
			System.out.println(d);
		}
	}

	public void info() {
		Inner inner = new Inner();
		inner.print();
	}
}

public class Ex07_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		outer.info();

		Outer.Inner inner = outer.new Inner();
		inner.print();
	}

}
