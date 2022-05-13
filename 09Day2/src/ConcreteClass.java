
public class ConcreteClass extends AbstractClass {

	public ConcreteClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConcreteClass(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("a()=====================");
	}

	@Override
	public int b() {
		// TODO Auto-generated method stub
		System.out.println("b()=====================");
		return 0;
	}

	@Override
	public String c(int x) {
		// TODO Auto-generated method stub
		System.out.println("c()=====================" +x);
		return null;
	}
	
}
