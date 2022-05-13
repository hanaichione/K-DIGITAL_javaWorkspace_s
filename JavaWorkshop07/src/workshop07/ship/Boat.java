package workshop07.ship;

public class Boat extends Ship {

	public Boat(String shipName, int fuelTank) {
		super(shipName, fuelTank);
		// TODO Auto-generated constructor stub
	}

	public Boat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void sail(int dist) {
		setFuelTank(getFuelTank() - (dist * 10));
	}

	public void refuel(int fuel) {
		setFuelTank(getFuelTank() + (fuel * 10));
	}

}
