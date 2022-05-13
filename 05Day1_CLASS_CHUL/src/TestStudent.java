public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// stu 객체 생성
		Student stu = new Student();
		
		System.out.println(stu);
		System.out.println(stu.name+"\t"+stu.age+"\t"+stu.address);
		
		// 실제 학생 한 명의 데이터 저장
		stu.name = "홍길동";
		stu.address = "서울";
		stu.age = 20;
		
		System.out.println(stu.name+"\t"+stu.age+"\t"+stu.address);
		
		// stu2 : 다른 객체 생성
		Student stu2 = new Student();
		
		stu2.name = "이순신";
		stu2.age = 44;
		stu2.address = "전라";
		
		System.out.println(stu2.name+"\t"+stu2.age+"\t"+stu2.address);
		
		// stu3 : 다른 객체 생성
		Student stu3 = new Student();
		
		stu3.name = "유관순";
		stu3.age = 19;
		stu3.address = "경기";
		
		System.out.println(stu3.name+"\t"+stu3.age+"\t"+stu3.address);
	}

}
