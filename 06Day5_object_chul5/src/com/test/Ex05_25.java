package com.test;

class Cat {

	String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	};
}

public class Ex05_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Cat [] cats = new Cat[3];
//		cats[0] = new Cat("나비");
//		cats[1] = new Cat("야옹이");
//		cats[2] = new Cat("점박이");
		
//		Cat [] cats = {
//				new Cat("나비"),
//				new Cat("야옹이"),
//				new Cat("점박이"),
//				new Cat("하늘")
//		};
			
		Cat [] cats = new Cat[] {
				new Cat("나비"),
				new Cat("야옹이"),
				new Cat("점박이"),
				new Cat("하늘")};
		
		for (Cat cat : cats) {
			System.out.println("이름: "+cat.getName());
		}
				
	
	}
}
