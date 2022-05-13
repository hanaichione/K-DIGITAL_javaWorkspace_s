import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("주소를 입력하시오. ");
//		String address_str = scan.next();
//		System.out.println(address_str);
//		System.out.println();
//		
//		String address [] = address_str.split("/");
//		
//		System.out.print(address[0]+" ");
//		System.out.print(address[1]+" ");
//		System.out.print(address[2]);
		
		String pro = scan.next();
		String si = scan.next();
		String gu = scan.next();
		
		System.out.println("도명 : "+pro+"\n시명 : "+si+"\n구명 : "+gu);
		
	}

}
