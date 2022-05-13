
public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// trim, length()
		String t="  hEllo   ";
		System.out.println(t.length());
		System.out.println(t.trim().length());
		
		// substring
		String xyz="helloworld";
		String q = xyz.substring(3);
		String q2 = xyz.substring(3,7);	// 3부터 7앞까지
		System.out.println(q);
		System.out.println(q2);
		
		// charAt 해당 위치에 있는 문자 하나 반환
		String s ="hello";
		char x = s.charAt(0);
		System.out.println(x);
		System.out.println(s.charAt(1));
		
		// concat 붙여줌
		String x2 = s.concat("world");
		System.out.println(x2);
		System.out.println(s); //원본글자
		
		// length
		int x3=s.length();
		System.out.println(x3);

		// 문자열 비교
		String aaa ="Hello";
		String aaa2 ="hello";
		
		///System.out.println(aaa == aaa2); 오류
		boolean result = aaa.equals(aaa2);
		System.out.println(result);
		
		boolean result2  =aaa.equalsIgnoreCase(aaa2);	// 길이가 같으면 같은 걸로
		System.out.println(result2);

		boolean kkk = s.contains("h");
		System.out.println(kkk);
		boolean kkk2 = s.contains("hx");
		System.out.println(kkk2);


	}

}
