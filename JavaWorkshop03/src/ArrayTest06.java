import java.util.Scanner;

public class ArrayTest06 {

	public static void main(String[] args) {
		
		// 스캔 객체 생성
		Scanner scan = new Scanner(System.in);
		
		// 안내문 출력
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		
		// 입력받기
		int num = scan.nextInt();
		
		// 사람 수만큼 배열 생성
		int[]height = new int[num];	
		
		// 사람 수만큼 키 배열 초기화
		for (int i = 0; i < height.length; i++) {
			System.out.print("사람"+(i+1)+" : ");
			height[i] = scan.nextInt();
		}
		
		// 최댓값 비교를 위한 max 함수 생성
		int max = height[0];
		
		// 최댓값 비교
		for (int i = 1; i < height.length; i++) {
			if(max < height[i]) {
				max = height[i];
			};
		}
		System.out.println("최댓값은 "+max+"입니다.");
		
	}	// main 끝
}
