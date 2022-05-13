package com.car;

public class L3 extends Car implements Temp {

	// 엔진온도측정
	@Override
	public int getTempGage() {
		return getDistance()/10;
	}
	
	// 주행
	@Override
	public void go(int distance) {
		setOilSize(getOilSize()-distance/10);
		setDistance(distance);
	}

	// Oil 충전
	@Override
	public void setOil(int oilSize) {
		// TODO Auto-generated method stub
		setOilSize(getOilSize() + oilSize);
	}

	// 생성자
	public L3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
		// TODO Auto-generated constructor stub
	}

}
