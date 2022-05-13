
public class Sample02_variable5 {	// 클래스 안 : 변수, 함수 선언 가능

	public static void main(String[] args) {	// main 시작
		int num = 10;	 // main에 속한 로컬변수
		// int num = 20; // 변수명 중복사용 불가
		System.out.println(num);
	}	// main 끝
	
	public void test() {
		int num = 20; // 로컬변수이기 때문에 다른 함수 내에서 사용 가능
		System.out.println(num);
	}	// test 끝
	
}
