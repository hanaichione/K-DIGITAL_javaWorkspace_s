
public class Sample06_circle_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;	
//		System.out.println(name.length());	// NullPointerException 아무것도 없는 곳에서 length함수 써서 오류 발생
		
		String name2 = null;
//		System.out.println((4<2)&&(name2.length()==4));	// (4<2)&& 에서 이미 false가 확정이라 뒤 코드는 확인 안 함
		System.out.println((4>2)&&(name2.length()==4)); // 뒤 코드도 실행되어 오류 발생
	}

}
