

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student stu = new Student("홍길동", 20, "서울");
		
		StudentUtil util = new StudentUtil(stu); // stu를 넘겨서 객체 생성
		System.out.println(util);
		util.setStu(stu);
		util.firstName();
		util.nameLength();
		
		util.setStu(new Student("이순신", 20, "서울"));
		util.firstName();
		util.nameLength();
		Student stu3 = util.getStu();
		System.out.println(stu3);
	}
}
