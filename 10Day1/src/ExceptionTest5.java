// catch try를 하나씩 써서 다 실행되게 하기

public class ExceptionTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("프로그램 시작");
		try {
			// Arithmetic
			int num = 10;
			int result = num / 0;
			System.out.println("결과는 " + result);
		} catch (ArithmeticException e) {
			System.out.println("예외발생1 " + e.getMessage());
		}
		
		try {// NullPointer
			String name = "A";
			System.out.println("글자수는 " + name.length());

		} catch (NullPointerException e) {
			System.out.println("예외발생2 " + e.getMessage());
		}
		
		System.out.println("프로그램 종료");
	}	// end main

}
