package company;

public class TestCompany {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		double sal = Double.parseDouble(args[0]);
		Company c = new Company(sal);
		System.out.println("연 기본급 합: "+c.getIncome()+" 세후: "+c.getAfterTaxIncome());
		System.out.println("연 보너스 합: "+c.getBonus()+"   세후: "+c.getAfterTaxBonus());
		System.out.println("연 지급액 합: "+(c.getAfterTaxBonus()+c.getAfterTaxIncome()));
	}

}
