/* 문법적인 부분의 오류 : 컴파일 오류 => .class 파일 생성 안 됨(실행 안 됨)
 * 실행시 오류 : 런타임 오류 -> 문법적 오류가 아닌 논리적 오류, 실행하다 발생시 멈춤
 * */

public class ExceptionTest {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		try {	// ex 발생 가능한 구간 코드를 넣음
			int num = 10;
			int result = num/0;					// java.lang.ArithmeticException: / by zero
			String test = "홍길동";
			System.out.println(test.length());	// java.lang.NullPointerException
			// 예외처리
			/// 발생시에도 끝까지 실행하도록 처리
			/// 에러 메시지를 디테일하게 출력
			// 예외처리 방법 : try~ catch문 사용
			
			System.out.println(result);
		} catch (RuntimeException e) {	// ex 발생시 처리 코드
			System.out.println("exception 발생하여 catch block 실행됨");
		}
		
		
		System.out.println("예외발생");
		System.out.println("프로그램 종료");
	}
}
