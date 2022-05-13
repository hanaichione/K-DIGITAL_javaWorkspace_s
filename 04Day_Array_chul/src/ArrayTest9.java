
public class ArrayTest9 {

	public static void main(String[] args) {
		
		// 2차원 배열
		// 2. 비정방형
		
		int [][] num = new int[2][];
		
		num[0] = new int[3];
		num[1] = new int[2];
		
		num[0][0] = 10;
		num[0][1] = 20;
		num[0][2] = 30;
		num[1][0] = 40;
		num[1][1] = 50;
		
		// 이중 for문으로 출력하기
//		for (int i = 0; i < num.length; i++) {
//			for (int j = 0; j < num[i].length; j++) {
//				System.out.println(num[i][j]);
//			}
//		}
		
		// 이중 for each문으로 출력하기
		for (int[] is : num) {
			for (int is2 : is) {
				System.out.println(is2);
			}
		}
		
		// 행, 열갯수 출력
		System.out.println("행의 갯수 : "+num.length);
		System.out.println("1행의 열 갯수 : "+num[0].length);
		System.out.println("2행의 열 갯수 : "+num[1].length);
	}	// main 끝

}
