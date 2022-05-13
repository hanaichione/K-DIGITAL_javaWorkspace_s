// catch try를 하나씩 써서 다 실행되게 하기
// finally 반드시 실행함

public class ExceptionTest6 {

	public static void main(String[] args) {
		try {
			// Arithmetic
			int num = 10;
			int result = num / 0;
			System.out.println("결과는 " + result);

			// NullPointer
			String name = "A";
			System.out.println("글자수는 " + name.length());

			// ArrayIndexOutOfBounds
			int[] num2 = { 10, 20 };
			System.out.println(num2[0]);

		} catch (NullPointerException e) {
			System.out.println("예외발생1 " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("예외발생2 " + e.getMessage());
		} catch (Exception e) { // Exception 범위가 크므로 마지막에 써줘야 함
			e.printStackTrace();
			System.out.println("예외발생3 " + e.getMessage());

		} finally {
			System.out.println("finally 반드시 수행되는 문장");
		}
		System.out.println("프로그램 종료");
	} // end main

} //
