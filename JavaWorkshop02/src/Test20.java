import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int time=0;
		double sal=0;
		double bonus=0;
		
		System.out.println("보너스 및 월급 구하기");
		
		do {
			System.out.print("근무시간입력 : ");
			time = scan.nextInt();
		}while(time<0);
		
		do {
			System.out.print("월급입력 : ");
			sal = scan.nextInt();
		}while(sal<0);
		
		System.out.println("=====================");
		
		if(time>=25) bonus = sal*1;
		else if(time>=20) bonus = sal*0.8;
		else if(time>=18) bonus = sal*0.5;		
		
		System.out.println("보너스 : "+bonus);
		System.out.println("지급될 급여 : "+(sal+bonus));
	}
}
