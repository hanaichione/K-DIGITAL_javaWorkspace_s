public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// stu1 객체 생성
		Student stu1 = new Student();
	
		// stu1 기본값
		System.out.println(stu1.name);
		System.out.println(stu1.age);
		System.out.println(stu1.address);
		
		// 초기화
		stu1.address = "서울";
		stu1.age = 20;
		stu1.name = "홍길동";
		
		System.out.println("=============================");
		System.out.println(stu1);
		System.out.println(stu1.name);
		System.out.println(stu1.age);
		System.out.println(stu1.address);
	}

}
