// catch try를 하나씩 써서 다 실행되게 하기
// catch 없어도 finally 실행됨

public class ExceptionTest7 {

	public static void main(String[] args) {
		try {
			// Arithmetic
			int num = 10;
			int result = num / 1;
			System.out.println("결과는 " + result);

		} finally {
			System.out.println("finally 반드시 수행되는 문장");
		}
		System.out.println("프로그램 종료");
	} // end main

} // end class
