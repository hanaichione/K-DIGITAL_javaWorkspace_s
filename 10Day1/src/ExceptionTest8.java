

public class ExceptionTest8 {

	private static void a() {		
		// 없어도 자동으로 throws 되지만 명시해야 함
		try {
			b();
		} catch (Exception e) {
			System.out.println("a()에서 처리함 "+e.getMessage());
		}
		System.out.println("a()함수 종료됨");
	}

	private static void b() throws Exception {
		int num = 10;
		int result = num / 0;
		System.out.println(result);

		System.out.println("b()함수 종료됨");
	}

	public static void main(String[] args) {		// 위임할 거라면 가급적 main까지 보내기 권장
		System.out.println("프로그램 시작");
//		try {		// 예외를 main에서 잡으면 a(), b() 함수에서 예외 코드 밑은 실행이 안 됨
//			a();
//		} catch (Exception e) {
//			System.out.println("main에서 처리함 "+e.getMessage());
//		}
		a();
		System.out.println("프로그램 종료");
	} // end main

} // end class
