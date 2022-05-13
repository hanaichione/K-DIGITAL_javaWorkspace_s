
public class ExceptionTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Arithmetic
			int num = 10;
			int result = num / 1;
			System.out.println("결과는 " + result);

			// NullPointer
			String name = "A";
			System.out.println("글자수는 " + name.length());

			// ArrayIndexOutOfBounds
			int[] num2 = { 10, 20 };
			System.out.println(num2[3]);

//		} catch (NullPointerException e) {
//			System.out.println("예외발생1 " + e.getMessage());
//		} catch (ArithmeticException e) {
//			System.out.println("예외발생2 " + e.getMessage());
		} catch (Exception e) {		// Exception 범위가 크므로 마지막에 써줘야 함
			e.printStackTrace();
			System.out.println("예외발생3 " + e.getMessage());	
		}
		System.out.println("프로그램 종료");
	}

}
