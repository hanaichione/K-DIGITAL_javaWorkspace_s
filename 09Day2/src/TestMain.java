
public class TestMain {

	public static void main(String[] args) {
//		AbstractClass x = new AbstractClass(); // 추상클래스 객체 생성 불가
		
		ConcreteClass y = new ConcreteClass(100);
		System.out.println(y.getNum());
		y.a();
		int n = y.b();
		y.c(200);
		
		ConcreteClass2 y2 = new ConcreteClass2();
		System.out.println(y2.getNum());
		y2.a();
		int n2 = y2.b();
		y2.c(100);
	}

}
