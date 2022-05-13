import java.util.Date;

class Box<T>{
	T obj;
	
	public void setValue(T obj) {
		this.obj = obj;
	}
	public T getValue() {
		return obj;
	}
	@Override
	public String toString() {
		return "Box [obj=" + obj + "]";
	}
	
}

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box<String> b = new Box<String>();
		b.setValue("Hello");
//		String str = (String)b.getValue();	// 부모타입에 들어가 있는 obj를 문자열로 변환(generic 안 썼을 때)
		System.out.println(b);
//		b.setValue(111);	// 컴파일 에러
//		b.setValue(new Date);	// 컴파일 에러
		
		Box<Date> b2 = new Box<>();	// 대입쪽에서 generic 생략 가능
		b2.setValue(new Date());
//		Date d = (Date)b2.getValue();
		System.out.println(b2);
	}

}
