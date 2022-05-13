
public class StudentUtil {

	// 기본 생성자 묵시적 삽입
	
	// public char firstName(String name)
	public void firstName(Student stu) {
		String name = stu.getName();
		char first = name.charAt(0);
		System.out.println("성은 : "+first);
//		return first;
	}
	
	// public int nameLength(String name)
	public void nameLength(Student stu) {
		String name = stu.getName();
		int l = name.length();
		System.out.println("길이는 : "+l);
//		return l;
	}

	// 메소드 체인 기법
	public int nameLength2(Student stu2) {
		// TODO Auto-generated method stub
		return stu2.getName().length();
	}
}
