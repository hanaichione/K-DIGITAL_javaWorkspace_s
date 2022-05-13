package workshop07.ship;

public class Cruise extends Ship {
	public Cruise(String shipName, int fuelTank) {
		super(shipName, fuelTank);
		// TODO Auto-generated constructor stub
	}

	public Cruise() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void sail(int dist) {
		setFuelTank(getFuelTank() - (dist * 13));
	}

	public void refuel(int fuel) {
		setFuelTank(getFuelTank() + (fuel * 8));
	}
}
