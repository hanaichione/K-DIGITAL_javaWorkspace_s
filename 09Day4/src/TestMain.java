
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// A a = new A();
		System.out.println(A.NUM);
		
		
		ConcreteClass c = new ConcreteClass();
		c.a();
		c.b();
		c.c();
		A.d();	// static
		
		A tt = new ConcreteClass();
	}

}
