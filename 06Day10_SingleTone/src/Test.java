import com.bank.Bank;

public class Test {

	public static void main(String[] args) {
		// kb은행 - 계좌*1000개를 한 개의 은행에서 관리할 수 있도록 하자(은행 생성을 한개 외에 막아주기) : 싱글톤
		Bank b = Bank.getBank();	// 무조건 getBank 이용해서 사용
		System.out.println(b);
		
		Bank b2 = Bank.getBank();
		System.out.println(b2);	// 주소 동일하게 나옴

		b.setName("kb");
		System.out.println(b.getName());
		System.out.println(b2.getName());
	}

}
