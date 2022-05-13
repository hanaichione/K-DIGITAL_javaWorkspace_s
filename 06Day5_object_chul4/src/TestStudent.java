

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student stu = new Student("홍길동", 20, "서울");
//		StudentUtil util = new StudentUtil(); // 사용 위해 객체 생성
		
//
//		util.firstName(stu);
//		util.nameLength(stu);
//		
//		Student stu2 = new Student("이순신", 40, "서울");
//		util.firstName(stu2);
//		util.nameLength(stu2);
		
		StudentUtil util = new StudentUtil(stu); // stu를 넘겨서 객체 생성
		System.out.println(util);
		util.firstName();
		util.nameLength();
		
		Student stu2 = new Student("이순신", 20, "서울");
		StudentUtil util2 = new StudentUtil(stu2);
		util2.firstName();
		util2.nameLength();
	}
}
