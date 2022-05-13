import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
//		// 주소 입력받고 문자 갯수 출력하기
//		System.out.println("주소를 입력하시오.");
//		String mesg = scan.nextLine();
//		System.out.println("문자 갯수(공백포함): "+mesg.length());
//		
//		// 단어 갯수 출력하기 split****
//		System.out.println("단어 갯수: "+mesg.split(" ").length);
//		
//		System.out.println("입력된 주소 : "+mesg);
		
		// split
		
		String s = "aaa/bbb/ccc";
		System.out.println("단어 갯수  : "+s.split("/").length);
		}

}
