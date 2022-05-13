
public class ArrayTest4 {
	
	public static void main(String [] arg) {
		
		// 배열 선언 후 초기화
		int [] num;
		num= new int[3];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		
		// 배열 선언과 동시에 초기화
		int [] num2 = {10, 20, 30};
		System.out.println(num2.length);
		System.out.println(num2[0]);
		System.out.println(num2[1]);
		System.out.println(num2[2]);

		// 배열 선언 및 초기화
		int [] num3;
		num3 = new int[] {10, 20, 30};	// 소실?됨
		num3 = new int[] {1, 2, 3, 4};
		
		// num4 for each 출력
		for (int i : num3) {
			System.out.println(i);
		}
		
		// 타입만 동일하면 배열의 길이는 상관 없음
		num = num3;
		System.out.println(num.length);
	}
}
