
public class Sample05_operator {

	public static void main(String[] args) {
		
		// 산술 연산자
//		int n = 10;
//		int n2 = 3;
		
//		System.out.println(n+n2);
//		System.out.println(n-n2);
//		System.out.println(n*n2);
//		System.out.println(n/n2);	// 3
//		System.out.println(n/3.0);	// 3.33333
//		System.out.println(n%n2);	// 1
		
		// 비교 연산자
//		int xyz = 5;
//		int xyz2 = 3;
//		boolean result = xyz == xyz2;
		
//		System.out.println(result);
//		System.out.println(xyz == xyz2);
//		System.out.println(xyz != xyz2);
//		System.out.println(xyz > xyz2);
//		System.out.println(xyz >= xyz2);
//		System.out.println(xyz < xyz2);
//		System.out.println(xyz <= xyz2);
		
		// 문자열의 비교 : java에서 문자열의 내용을 비교할 때는 반드시 equals 함수 사용
//		String nn= "홍길동";
//		String nn2 = "홍길동";
//		String nn3 = new String("홍길동");
//		System.out.println(nn==nn2);		// 주소 비교
//		System.out.println(nn.equals(nn2));	// 내용 비교
//		System.out.println(nn == nn3);		// 주소 비교, false
//		System.out.println(nn.equals(nn3));
		
		// 대입 연산자
//		int x = 10;
//		int x2 = x;
//		System.out.println(x2 += x);
//		System.out.println(x2 -= x);
//		System.out.println(x2 *= x);
//		System.out.println(x2 /= x);
//		System.out.println(x2 %= x);
		
		// 증감 연산자
		int k = 10;
		++k;
		System.out.println(k);
		k++;
		System.out.println(k);
		
		int y = 10;
		int y2 = ++y;
		System.out.println(y+"\t"+y2);
		int y3 = y++;
		System.out.println(y+"\t"+y3);
		
		// 논리 연산자
		System.out.println(3==4 && 4>3);
		
		System.out.println(!true);
		System.out.println(!false);

		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
	}

}
