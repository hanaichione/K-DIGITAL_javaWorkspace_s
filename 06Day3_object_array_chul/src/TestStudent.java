
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Student stu = new Student("홍길동", 10);
//		System.out.println(stu);
//		
//		Student stu2 = new Student("이순신", "서울");
//		System.out.println(stu2);
		
		Student stu = new Student("홍길동1","서울1");
		Student stu2 = new Student("홍길동2","서울2");
		Student stu3 = new Student("홍길동3","서울3");
		Student stu4 = new Student("홍길동4","서울4");
		Student stu5 = new Student("홍길동5",19,"서울5");

		Student [] yy = new Student[5];
		System.out.println(yy);
		System.out.println(yy[0]);
		
		yy[0]=stu;
		yy[1]=stu2;
		yy[2]=stu3;
		yy[3]=stu4;
		yy[4]=stu5;
		
		/// ********** 중요 : 객체를 배열에 저장하고 참조변수로 필요한 것만 뽑아오기
		for (int i = 0; i < yy.length; i++) {
			System.out.println(yy[i].getName());
		}
		System.out.println("========================================");
		
		// 이름 바꾸면 아래서 바뀌어서 출력됨
		yy[0].setName("aaaaaa");

		for (Student student : yy) {
			System.out.println(student.getAge());
		}
		
		// 바로 넣어주기
		Student [] yy2 = {stu,stu2,stu3,stu4,stu5};
		for (Student student : yy2) {
			System.out.println(student);
		}
	}

}
