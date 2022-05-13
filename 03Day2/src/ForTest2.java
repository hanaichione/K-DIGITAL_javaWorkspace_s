
public class ForTest2 {

	public static void main(String[] args) {
		
		// 1. for문 break;
//		for (int i = 0; i < 5; i++) {
//			System.out.println("hello "+i);
//			if(i==3) break;
//		}
//		System.out.println("for밖");
		
		// 2. for문 continue;
//		for (int i = 0; i < 5; i++) {
//			System.out.println("hello1 "+i);
//			System.out.println("hello2 "+i);
//			if(i==3)continue;		// i==3 일 때 반복문 처음으로 돌아가므로 아래 hello3 3, hello4 3은 찍히지 않음
//			System.out.println("hello3 "+i);
//			System.out.println("hello4 "+i);
//		}
		
		// 3. 라벨
		A:
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 4; j++) {
					System.out.println(i+"\t"+j);
					if(i==3) continue A;	// i가 3일 때 A로 빠져나가서 i가 4일때를 실행
				}
			}
		
	}
}
