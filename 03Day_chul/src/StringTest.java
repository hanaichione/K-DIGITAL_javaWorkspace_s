
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1
		String s = new String("hello");
		String s2 = new String("hello");
		System.out.println(s==s2);		// 주소를 비교함, false
		boolean result = s.equals(s2);
		System.out.println(result);		// 내용을 비교함, true
		
		//2
		String n = "hello";
		String n2 = "hello";
		System.out.println(n==n2);		// true
	
	}	

}
