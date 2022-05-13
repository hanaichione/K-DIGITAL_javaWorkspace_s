
public class StudentUtil {

	// 기본 생성자 묵시적 삽입
	
	// public char firstName(String name)
	public char firstName(Student stu) {
		String name = stu.getName();
		char first = name.charAt(0);
		return first;
	}
	
	// public int nameLength(String name)
	public int nameLength(Student stu) {
		String name = stu.getName();
		int l = name.length();
		return l;
	}

	// 메소드 체인 기법
	public int nameLength2(Student stu2) {
		// TODO Auto-generated method stub
		return stu2.getName().length();
	}
}
