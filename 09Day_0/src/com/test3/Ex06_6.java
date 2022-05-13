package com.test3;

class Employee {
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
//		System.out.println("emp getEmployee()===========");
		return name + " " + salary;
	}
} // end emp

class Manager extends Employee {
	String depart;

	public Manager(String name, int salary, String depart) {
		super(); // 부모 클래스인 Employee 상속 중
//		super(name, salary);
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
	
	@Override
	public String getEmployee() {
//		System.out.println("manager getEmployee()===========");
		return super.getEmployee() + " " + depart;
//		return name + " " + salary + " " + depart;
	}
	
	public void print() {	// 자식이 가지고 있는 유일한 함수
		System.out.println("manager print()==================");
	}

} // end Manager

public class Ex06_6 {
	public static void main(String[] args) {
//		Manager man = new Manager("이순신", 4000, "개발");
//		System.out.println(man.getEmployee());		// 부모 클래스에 있는 함수도 사용이 가능
//		
//		Employee t = new Manager("aaa", 100, "bb");	// 다형성(Polymorphism) : 부모 타입에 자식 타입 저장이 가능
//		// t.depart; // 오류, 다형성으로 저장 가능하지만 type이 Employee이므로 부모의 함수, 변수만 사용 가능
////		t.name;
////		t.salary;
//		System.out.println(t.getEmployee());	// getEmployee 오버라이딩, 실제 객체 타입인 자식 함수가 호출됨
//		// 오버라이딩 함수는 실제 객체의 함수가 출력됨
//		
//		Manager m = (Manager)t;	// 형변환을 해야 자식 타입의 함수, 변수를 모두 사용할 수 있음
//		System.out.println(m.getEmployee());
//		m.print();
		
		Employee e = new Manager("aa", 100, "bb");
		System.out.println(e.getEmployee());	// Overriding된 함수의 경우 저장된 실제 객체의 함수가 호출
//		e.print();	// print()함수는 자식 객체에만 있기 때문에 오류 발생
		((Manager)e).print();	// 형변환 후 유일 함수 사용
		
	}
}

// 다형성
// 1. 부모타입의 변수로 자식 객체 저장 가능(매개변수, 리턴타입도 사용가능)
// 2. 부모자식 간 오버라이딩 된 함수는 다형성 변수로 호출 가능 : 실제 저장된 자식 객체의 함수 호출(형변환 필요 없음)
// 3. 자식의 유일한 변수, 함수 사용을 위해 형변환 후 사용해야 함
