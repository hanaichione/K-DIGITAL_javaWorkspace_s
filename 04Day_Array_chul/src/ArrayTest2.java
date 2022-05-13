
public class ArrayTest2 {

	public static void main(String[] args) {

		int num [] = new int[3];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;		
		
		// 덮어 쓰는 게 아니라 아예 새로운 위치에 새로운 배열이 생김
		num = new int[4];
		num[0] = 1;
		num[2] = 3;
		num[3] = 4;
		
		// 1 0 3 4 출력
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(" "+num[i]+" ");
//		}
		
		// foreach로 출력
		for (int i : num) {
			System.out.println(i);
		}
		
		
		// 문자열 배열 저장 및 출력
		String name [] = new String[3];
		// System.out.println(name[0]);
		name[0] = "홍길동";
		name[1] = "이순신";
		name[2] = "유관순";
		
		for (String s : name) {
			System.out.println(s);
		}
		
	}

}
