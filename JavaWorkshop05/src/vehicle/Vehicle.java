package vehicle;

public class Vehicle {
	
	// 멤버 함수
	private int maxWeight;
	private double oilTankSize;
	private double efficiency;
	
	// 생성자
	public Vehicle(int maxWeight, double oilTankSize, double efficiency) {
		super();
		this.maxWeight = maxWeight;
		this.oilTankSize = oilTankSize;
		this.efficiency = efficiency;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// toString
	@Override
	public String toString() {
		return maxWeight + "\t\t" + oilTankSize;
	}
	
	// get set
	public int getMaxWeight() {
		return maxWeight;
	}
	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	public double getOilTankSize() {
		return oilTankSize;
	}
	public void setOilTankSize(double oilTankSize) {
		this.oilTankSize = oilTankSize;
	}
	public double getEfficiency() {
		return efficiency;
	}
	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}
	
}
