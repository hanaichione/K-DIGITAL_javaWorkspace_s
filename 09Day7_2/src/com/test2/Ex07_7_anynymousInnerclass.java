package com.test2;

interface Flyer{
	public abstract void takeOff();
	public abstract void fly();
	public void land();
}

public class Ex07_7_anynymousInnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flyer f = new Flyer() {
			public void fly() {
				System.out.println("fly");
			}
			@Override
			public void takeOff() {
				System.out.println("takeOff");
			}
			@Override
			public void land() {
				System.out.println("land");
			}
		};
		f.fly();
		f.takeOff();
		f.land();
	}

}
