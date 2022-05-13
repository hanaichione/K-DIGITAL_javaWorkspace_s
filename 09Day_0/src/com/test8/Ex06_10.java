package com.test8;

import java.util.Date;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class Ex06_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.toString());
		
		Person p = new Person("홍길동", 44);
		System.out.println(p);
		System.out.println(p.toString());
		
	}

}
