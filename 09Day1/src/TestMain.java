
public class TestMain {

	public static void main(String[] args) {
//		AbstractClass x = new AbstractClass(); // 추상클래스 객체 생성 불가
		
		ConcreteClass y = new ConcreteClass(100);
		System.out.println(y.getNum());
		AbstractClass y2 = new ConcreteClass(200);
		System.out.println(y2.getNum());
		
	}

}
