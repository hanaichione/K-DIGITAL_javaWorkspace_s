package com.test7;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}

public class Ex06_9 {
	
	public static void main(String[] args) {
		Person p = new Person("홍길동", 44);
		Person pp = new Person("홍길동", 44);	
		System.out.println(p==pp);
		if(p.equals(pp)) {System.err.println("p와 pp가 같다.");}	
		// equals가 Object에 주소 비교 함수로 있기 때문에 오버라이딩 하지 않는 한 주소를 비교하여 false 나옴
		else {System.err.println("p와 pp가 다르다.");}
	}
}
