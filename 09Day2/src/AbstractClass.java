// 추상 함수가 없어도 추상 클래스로 만들 수 있음

public abstract class AbstractClass {		// 추상클래스 선언
	private int num;
	
	// 추상 메서드
	public abstract void a();
	public abstract int b();
	public abstract String c(int x);

	public AbstractClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AbstractClass(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
