
public class WhileTest {

	public static void main(String[] args) {
		
		int n=0;//조건식
		while(n<=10) {
			if(n==5) break;//continue;
			System.out.println("hello "+n);
			n++;	// 증감식 빠지면 무한루프
			// n--;	// 잘못된 증감식 무한루프
		}
		System.out.println("while 빠져나옴 n = "+n);
		System.out.println("==============================");
		
		// do while
//		int n2=100; // while 조건에 안 맞아도 일단 한 번은 실행됨
//		int n2=100;
//		do {
//			System.out.println("world "+n2);
//			// n2++;
//			++n2;	// 후위, 전위 똑같은 결과
//		} while(n2<5);
		
//		int n2=0;
//		do {
//			if(n2==2) continue;	// 조건 충족시 해당 블록을 찾아가 다시 실행
//			System.out.println("world "+n2);
//			// n2++;
//			++n2;	// 후위, 전위 똑같은 결과
//		} while(n2<5);
	}
}
