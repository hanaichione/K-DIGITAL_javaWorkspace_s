/* 문법적인 부분의 오류 : 컴파일 오류 => .class 파일 생성 안 됨(실행 안 됨)
 * 실행시 오류 : 런타임 오류 -> 문법적 오류가 아닌 논리적 오류, 실행하다 발생시 멈춤
 * */
/* pro ExceptionTest2는 catch(Eception e)하고 
 * ExceptionTest3은 catch(ArithmeticException e)하고 있음
 * */
public class ExceptionTest2 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		int num = 0;
		try { // ex 발생 가능한 구간 코드를 넣음
			
			num = 10;
			int result = num / 1; // java.lang.ArithmeticException: / by zero
			System.out.println(result);
			String test = null;
			System.out.println(test.length());
			
		} catch (ArithmeticException e) { // ex 발생시 처리 코드
			e.printStackTrace(); // 무슨 에런지, 발생 이유, 어디서 발생
			System.out.println("예외발생: " + e.getMessage()); // 발생 이유
		
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("nullpointer 발생 " + e.getMessage());
		} // end catch
		
		System.out.println(num); // try블럭 내에서 선언 => 밖에서 사용 불가
		System.out.println("프로그램 종료");
	} // end main
}
