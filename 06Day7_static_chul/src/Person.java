public class Person {

	// 인스턴스 변수, new 할 때 생성~객체소멸, 사용 : 생성 후 변수명.name
	String name;
	
	// static 변수(클래스 변수), 프로그램 실행시 main 실행 전 미리 생성~프로그램 종료
	/// 객체간의 공유변수로 사용 : 클래스명.age(참조변수 필요 없음)
	static int age;
	
	public void a() {
		System.out.println(this.name);
		System.out.println(age);
	}
	
	
}
