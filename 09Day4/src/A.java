
public interface A {
	
	int NUM = 10;	// interface 는 public static final 상수만 사용 가능, 
	// 자동으로 지정된다. 
	public abstract void a();
	public void b();	// 자동으로 abstract 추가된 추상 함수
	
	public default void c() {
		System.out.println("c");
	}
	
	public static void d() {
		System.out.println("d");
	}
//	 public void e(){}	// 일반 메서드 불가
}
