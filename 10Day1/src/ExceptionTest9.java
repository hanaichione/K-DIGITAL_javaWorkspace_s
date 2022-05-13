// catch try를 하나씩 써서 다 실행되게 하기

public class ExceptionTest9 {

	private static void a() throws ArithmeticException, NullPointerException {
		// 없어도 자동으로 throws 되지만 명시해야 함
		b();
		System.out.println("a()함수 종료됨");
	}

	private static void b() throws ArithmeticException, NullPointerException {
		int num = 10 / 0;
		String name = null;
		System.out.println(name.length());
		System.out.println("b()함수 종료됨");
	}

	public static void main(String[] args) { // 위임할 거라면 가급적 main까지 보내기 권장
		System.out.println("프로그램 시작");
		try {
			a();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("main에서 예외처리 " + e.getMessage());
		} 
	} // end main

} // end class
