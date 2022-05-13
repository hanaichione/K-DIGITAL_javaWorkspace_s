package com.test6;

class Pet {
	String name;
	int age;
	String gender;

	public Pet(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getPet() {
		return name + "\t" + age + "\t" + gender;
	}
}

class Cat extends Pet {
	String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Cat(String name, int age, String gender, String color) {
		super(name, age, gender);
		this.color = color;
	}

	@Override
	public String getPet() {
		return super.getPet() + "\t" + color;
	}

}

class Dog extends Pet {
	String species;

	public Dog(String name, int age, String gender, String species) {
		super(name, age, gender);
		this.species = species;
	}

	@Override
	public String getPet() {
		return super.getPet() + "\t" + species;
	}
}

public class TestPet {
	public static void main(String[] args) {
		
		Pet [] pets = {
				new Cat("나비", 2, "암컷", "흰색"),
				new Cat("하늘", 5, "수컷", "회색"),
				new Dog("멍멍", 3, "수컷", "리트리버"),
				new Cat("야옹이", 20, "수컷", "검정"),
				new Dog("망치", 1, "수컷", "불독")};
		
		for (Pet pet : pets) {
			System.out.println(pet.getPet());	
			// getPet은 오버라이딩 함수, 고양이인 경우 색/강아지인 경우 종이 출력
		}
		System.out.println("==========================");
		for (Pet pet : pets) {
			if(pet instanceof Cat) {
//				Cat c = (Cat) pet;
				System.out.println("고양이 : "+pet.getPet());
				System.out.println(((Cat)pet).getColor());}	
				// getPet 오버라이딩이기 때문에 형변환 안 해도 Cat.getpet으로 찍어줌
				
		}	// for end
		
	}	// main end
}	// class end
