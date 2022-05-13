package mobile;

public class MobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile L = new Ltab("Ltab", 500, "AP-01");
		Mobile O = new Otab("Otab", 1000, "AND-20");
		
		System.out.println("Mobile    "+"Battery    "+"OS");
		System.out.println("-------------------------------");
		System.out.println(L.print());
		System.out.println(O.print());
		
		System.out.println("10분 충전");
		
		L.charge(10);
		O.charge(10);
		
		System.out.println("Mobile    "+"Battery    "+"OS");
		System.out.println("-------------------------------");
		System.out.println(L.print());
		System.out.println(O.print());
		
		System.out.println("5분 통화");
		
		L.operate(5);
		O.operate(5);
		
		System.out.println("Mobile    "+"Battery    "+"OS");
		System.out.println("-------------------------------");
		System.out.println(L.print());
		System.out.println(O.print());
		
	}

}
