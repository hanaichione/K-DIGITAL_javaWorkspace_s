package vehicle;

public class Car extends Vehicle {
	
	// 멤버함수
	private double restOil;
	private int curweight;
	
	// 생성자
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
		// TODO Auto-generated constructor stub
	}
	
	// get set	
	public double getRestOil() {
		return restOil;
	}
	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}
	public int getCurweight() {
		return curweight;
	}
	public void setCurweight(int curweight) {
		this.curweight = curweight;
	}
	
	// 함수
	public void addOil(int oil) {
		if(getOilTankSize() >= restOil+oil) {
		restOil += oil;
		} else System.out.println("오일탱크크기를 초과할 수 없습니다.");
	}
	public void moving(int distance) {
		restOil -= (distance/getEfficiency());
	}
	public void addWeight(int weight) {
		if(getMaxWeight() >= curweight+weight) {
		curweight += weight;
		} else System.out.println("최대적재중량을 초과합니다.");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() +"\t\t" + restOil + "\t\t" + curweight;
	}
	
}
