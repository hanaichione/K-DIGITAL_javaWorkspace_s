// static -> 인스턴스 -> 생성자 순으로 컴파일 이루어짐

public class TestMain {

	static {
		System.out.println("static 초기화 블럭");
	}
	
	{	// 객체 생성시 초기화
		System.out.println("인스턴스 초기화 불럭");
	}
	
	public TestMain() {
		System.out.println("TestMain 생성자");
	}
	
	public static void main(String[] args) {
		TestMain m = new TestMain();
		TestMain m2 = new TestMain();
	}
	
}
