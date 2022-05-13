package com.car;

public abstract class Car {
	private String name;
	private String engine;	
	private int oilTank;		// Oil Tank 사이즈
	private int oilSize;		// 현재 주유된 Oil 양
	private int distance;	// 주행거리
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}

	public String getEngine() {
		return engine;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public Car(String name, String engine, int oilTank, int oilSize, int distance) {
		super();
		this.name = name;
		this.engine = engine;
		this.oilTank = oilTank;
		this.oilSize = oilSize;
		this.distance = distance;
	}

	public int getOilTank() {
		return oilTank;
	}

	public int getOilSize() {
		return oilSize;
	}

	public int getDistance() {
		return distance;
	}

	public void setOilTank(int oilTank) {
		this.oilTank = oilTank;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public void go(int distance) {
		
	}
	
	public void setOil(int oilSize) {
		
	}
}
