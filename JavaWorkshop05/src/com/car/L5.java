package com.car;

public class L5 extends Car implements Temp {

	// 엔진온도측정
	@Override
	public int getTempGage() {
		return getDistance()/5;
	}

	// 주행
	@Override
	public void go(int distance) {
		setOilSize(getOilSize()-distance/8);
		setDistance(distance);
	}

	// Oil 충전
	@Override
	public void setOil(int oilSize) {
		// TODO Auto-generated method stub
		setOilSize(getOilSize() + oilSize);
	}

	// 생성자
	public L5() {
		super();
		// TODO Auto-generated constructor stub
	}

	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
		// TODO Auto-generated constructor stub
	}

	
}
