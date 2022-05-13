
public class ArrayTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2차원 배열
		// 1. 정방형
		
		// 가. 배열선언
		int [][] num;
		
		// 나. 배열생성
		num = new int[2][3];	// 2행 3열
		
		num[0][0] = 10;
		num[0][1] = 20;
		num[0][2] = 30;
		
		num[1][0] = 40;
		num[1][1] = 50;
		num[1][2] = 60;
		
		System.out.println(num);		// 주소
		System.out.println(num[0]);		// 주소
		System.out.println(num[1][1]);	// 값
		
//		for (int i = 0; i < num.length; i++) {			// 행 길이
//			for (int j = 0; j < num[i].length; j++) {	// 열 길이
//				System.out.print(num[i][j]);
//			}
		
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				sum += num[i][j];
			}
		}
		System.out.println(sum);
		System.out.println("=====================");
		int sum2 = 0;
		for (int[] i : num) {
			System.out.println(i);
			for (int j : i) {
				System.out.println(j);
				sum2 += j;
			}
		}
		System.out.println("=====================");
		System.out.println(sum2);
		
	}	// main 끝

}
