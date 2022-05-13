
public class TestMain {
	// 멤버변수
	int num;	
	
	// 멤버함수
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	// 기본생성자

	// 
	private static void test() {
		// TODO Auto-generated method stub
		System.out.println("test 함수 호출됨====================");
	}

	public static void main(String[] args) {		
		// TODO Auto-generated method stub

//		System.out.println(this.num);	// 오류 발생(객체 생성 전 사용 불가) static 어쩌구
		
		test();							// static 때문에 가능
		
		// 같은 클래스의 멤버변수도 객체 생성 후 사용 가능
		TestMain t= new TestMain();
		System.out.println(t.num);
		t.setNum(100);
		System.out.println(t.getNum());
		
	}	// main


}	// class
