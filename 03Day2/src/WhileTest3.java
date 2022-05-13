import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("끝내려면 종료 입력");
		while (true) {									// 강제 무한 반복
			String data = scan.next();					// 종료 입력하지 않으면 항상 실행
			if (data.equals("종료"))
				break;									// 종료 입력시에만 break;로 빠져나옴
			System.out.println("입력한 값은 : " + data);	// 종료 입력하지 않으면 항상 실행
		}
		System.out.println("종료됨");
	}

}
