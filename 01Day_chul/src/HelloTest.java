
public class HelloTest { // 클래스이름 식별자 == 파일 이름과 동일, 유일
	// 클래스 안에 사용
	// 1. 변수를 선언(사용할 수 있도록 값을 저장)
	// 2. 함수를 선언(함수 안에 프로그램 동작 코드 작성)
	// 3. 생성자 선언
	public static void main(String[] args) { // 함수 이름 식별자
		
		int num = 100; // 변수 이름 식별자 : 정수형 변수 num에 100 값 대입(저장)
		// int num = 200; 식별자 중복, 오류
		int num2 = 200;
		// int if = 300; 예약어는 식별자 사용 불가
	 	System.out.println("hello" + num + num2);
	 	
	} // main 함수의 끝

	public void test() { // 함수 이름 식별자

	} // test 함수 끝

} // class 끝
