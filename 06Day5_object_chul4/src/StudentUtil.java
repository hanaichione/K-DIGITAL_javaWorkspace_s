
public class StudentUtil {

	// 기본 생성자 묵시적 삽입
	
	Student stu;	// 하나의 클래스에 다른 클래스가 멤버변수로 포함 : has a 관계
	// --> 메인에서 생성한 stu를 가지게 됨
	
	public StudentUtil(Student stu) {
		// super();
		this.stu= stu;
	}
	
	public StudentUtil() {
	}
	
	// public char firstName(String name)
	public void firstName() {
		String name = this.stu.getName();
		char first = name.charAt(0);
		System.out.println("성은 : "+first);
//		return first;
	}
	
	// public int nameLength(String name)
	public void nameLength() {
		String name = this.stu.getName();
		int l = name.length();
		System.out.println("길이는 : "+l);
//		return l;
	}

	// 메소드 체인 기법
	public int nameLength2() {
		// TODO Auto-generated method stub
		return stu.getName().length();
	}

	@Override
	public String toString() {
		return "StudentUtil [stu=" + stu + "]";
	}
	
	
}
