
public class TestMain {

	public static void main(String[] args) {

		System.out.println(Person.age);	//static 변수 : 객체 생성 없이 클래스이름.변수명으로 사용 가능
		System.out.println("====================");
		
		Person p = new Person();
		p.name="홍길동";
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println("====================");
		
		p.a();
		System.out.println("====================");
		
		Person.age=10;		// static 변수는 객체의 공유변수가 됨
		Person p2 = new Person();
		p2.name = "이순신";
		p2.a();				// 이순신 10 나옴
		p.a();				// 홍길동 10 나옴
		
	}

}
