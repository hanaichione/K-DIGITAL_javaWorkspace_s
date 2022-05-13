package com.test;

class Employee extends Object {
	String name;	// private으로 막으면 자식 클래스에서 사용이 안 됨
	int salary;

	public Employee() {		// 부모 생성자가 없으면 자식 클래스에서 못 찾기 때문에 오류 발생
		super(); // 부모의 기본생성자 호출 , 부모 먼저 생성 후 자신을 생성함
		// TODO Auto-generated constructor stub
		System.out.println("emp 기본생성자 호출 됨 ============");
	}

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getEmployee() {
		return name + " " + salary;
	}
} // end emp

class Manager extends Employee {
	String depart;

	public Manager(String name, int salary, String depart) {
		super(); // 부모 클래스인 Employee 상속 중
		this.depart = depart;
		this.salary = salary;
		this.name = name;
		System.out.println("Manager 생성자 호출됨 ===============");
	}

	// 기본생성자
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	// getManager
	public String getManager() {
		return name + " " + salary + " " + depart;
	}

} // end Manager

public class Ex06_1 {
	public static void main(String[] args) {
		Employee emp = new Employee("홍길동", 2000);
		System.out.println(emp.getEmployee());
		System.out.println("===========================");
		Manager man = new Manager("이순신", 4000, "개발");
		System.out.println(man.getManager());
		System.out.println(man.getEmployee());		// 부모 클래스에 있는 함수도 사용이 가능
	}
}
