
public class TestStudent {

	public static void main(String[] args) {
//		Student stu1 = new Student("홍길동", 10, "서울");
//		
//		// stu1.age = -10; 접근제한으로 접근 불가
//		
//		// set 함수로 데이터 변경
//		stu1.setName("김길동");
//		stu1.setAge(20);
//		stu1.setAddress("제주");
//		
//		// System.out.println(stu1.name+"\t"+stu1.age+"\t"+stu1.address);
//		// get 함수로 데이터 출력
//		 System.out.println(stu1.getName()+"\t"+stu1.getAge()+"\t"+stu1.getAddress());
//		
//		// 정보은닉화(인캡슐레이션)
//		/* 1. 멤버변수에 접근제한 걸기
//		 * 2. 각 멤버변수에 접근하는 get, set함수 만들기
//		 * 3. 다른 클래스에서 get, set을 통해 변수에 접근, 사용
//		 * */
		
//		Student stu = new Student("aa", 10);
//		// stu.name = "홍길동";	//error
//		stu.setName("홍길동");
//		// System.out.println(stu.getName()+"\t"+stu.getAge());
//		stu.PrintData();
//		
//		Student stu2 = new Student("bb", 2);
//		
//		stu2.PrintData();
		
		Student stu = new Student("aa", 10, "서울");
		stu.setName("홍길동");
		stu.setAddress("제주");
		
		Student stu2 = new Student("이순신", 20, "경기");
		
		stu.print();
		stu2.print();
	}
	
	// 함수의 문법 - 클래스 블럭에 위치
	// 접근제한자 리턴타입(반환값)/ 반환값이 없는 경우 void 함수이름 (식별자) (매개변수) {}
	

}
