import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		String mesg = "100/200";
		String str [] = mesg.split("/");
		
		// 그냥 한 번 출력해 봄
		for (String s : str) {
			System.out.println(s);
		}
		
		int n = Integer.parseInt(str[0]);
		int n2 = Integer.parseInt(str[1]);
		
		// 합계와 평균 출력
		System.out.println("정수값 합계 : "+(n+n2));
		System.out.println("정수값 평균 : "+((n+n2)/str.length));
		}
	
}
