


public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu = new Student("홍길동", 20, "서울");
		StudentUtil util = new StudentUtil(); // 사용 위해 객체 생성
//		StudentUtil util = null;		// 아래 코드 오류 : Exception in thread "main" java.lang.NullPointerException
		char c = util.firstName(stu);	
		int n = util.nameLength(stu);
		System.out.println("성은 "+c+"\n이름의 길이 "+n);
		
		System.out.println("===================================");
		
		Student stu2 = new Student("박혁거세", 40, "경기");
		char cc = util.firstName(stu2);
		int nn = util.nameLength(stu2);
		System.out.println(c+"\t"+n);
		System.out.println(cc+"\t"+nn);

		System.out.println("길이는 ============== "+util.nameLength2(stu2));
	}
}