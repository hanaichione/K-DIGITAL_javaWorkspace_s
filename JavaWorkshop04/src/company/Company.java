package company;

public class Company {

	private double salary;
	private double income;
	private double afterTaxIncome;
	private double bonus;
	private double afterTaxBonus;
	
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(double salary) {
		super();
		this.salary = salary;
	}
	
	public double getIncome() {
		return income = 12*salary;
	}
	
	public double getAfterTaxIncome() {
		return afterTaxIncome = income*0.9;
	}
	
	public double getBonus() {
		return bonus = salary*4*0.2;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getAfterTaxBonus() {
		return afterTaxBonus = bonus*(1-0.055);
	}
	
	
}
