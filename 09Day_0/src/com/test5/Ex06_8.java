package com.test5;

class Employee {
//	public void taxRate(Object e) {	// 모두 Object의 자식이므로 이 코드도 문제 없음
	public void taxRate(Employee e) {
		if (e instanceof Manager) {		// instanceof 자식부터 부모 순으로 조건을 걸어야 함
			Manager m = (Manager) e;
			System.out.println("Manager 세금 구하기");
		} else if (e instanceof Engineer) {
			Engineer en = (Engineer) e;
			System.out.println("Engineer 세금 구하기");
		} else if (e instanceof Employee) {
			System.out.println("Employee 세금 구하기");		
			// 부모 타입을 가장 아래에서 걸러내야 함
			/// 모든 타입이 부모에 포함되기 때문!
		}
	}	// taxRate end
	
	public Employee test() {	// 모든 코드 문제 없음(다형성)
//		return new Employee();
//		return new Manager();
		return new Engineer();
	}
}

class Manager extends Employee {
}

class Engineer extends Employee {
}

public class Ex06_8 {
	public static void main(String [] args) {
		Employee emp = new Employee();
		Manager man = new Manager();
		Engineer eng = new Engineer();
		
		emp.taxRate(emp);
		man.taxRate(man);
		eng.taxRate(eng);
	}
}
