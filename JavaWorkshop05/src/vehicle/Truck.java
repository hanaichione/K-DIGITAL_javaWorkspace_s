package vehicle;

public class Truck extends Car {

	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
		// TODO Auto-generated constructor stub
	}
	
	public double getEfficiency() {
		return super.getEfficiency() - (getCurweight()/5.0)*0.2;
	}
	
	public double calcOil(int distance) {
		return distance/getEfficiency();
	}
	
	public void moving(int distance) {
		setRestOil(getRestOil()-calcOil(distance));
	}
	
	public int getCost(int distance) {
		return (int)calcOil(distance)*3000;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\t\t" + getEfficiency();
	}

	
	
}
