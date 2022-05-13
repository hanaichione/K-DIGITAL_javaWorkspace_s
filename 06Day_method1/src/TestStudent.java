
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu = new Student("홍길동", 20, "서울");
		String name = stu.getName();
		int age = stu.getAge();
		String address = stu.getAddress();
		
		// 오류 예시
		// int aaa = stu.setAge(50);
		// stu.setAge();
		// stu.setAge("홍길동", 10);
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(stu); 	// toString() 함수
		// 묵시적 참조변수.toString(); 로 변환사용 => toString이 구현 안 된 경우 객체 주소 출력
		// 구현된 경우 toString 호출 사용
		System.out.println(stu.toString());

	}

}
