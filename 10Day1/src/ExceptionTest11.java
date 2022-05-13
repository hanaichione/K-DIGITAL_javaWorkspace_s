
// RuntimeException계열은 예외처리를 하지 않는다.
// 컴파일 uncheck ==> 컴파일러가 예외처리 여부를 확인 안함.==> 
// 원래 예외가 발생되지 않는다고 생각한다.==> 개발자가 발로 코드작성.
/*
 *   1. ArithmeticException
 *      int num = 10;
 *      int x = 0;
 *      if(x!=0){
 *        int result = num/x;
 *      }
 *   2. NullPointerException
 *   String name = null;
 *   if(name != null){
 *     sysout(name.length())
 *   }  
 *   
 *   결론은 Runtime계열은 try~catch 또는 throws문장으로 
 *   예외처리를 하는것이 아니고 명시적인 조건체크로 처리해야 된다.
 *   
 *   반대로 compile checked 계열은 조건체크로 불가능하다.
 *   따라서 반드시  try~catch 또는 throws문장으로 처리해야 된다.
 *   ( IOException ,SQLException )
 * 
 */

public class ExceptionTest11 {

	public static void a() {
		b();
	}
	public static void b()  {
		int num =10;
		int result =num/0;
		System.out.println(result);
	}
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
	 try {	
		a();
	 }catch(ArithmeticException e) {
		 System.out.println(e.getMessage()+": catch문 실행");
	 }
		System.out.println("프로그램 종료");
	}
}
