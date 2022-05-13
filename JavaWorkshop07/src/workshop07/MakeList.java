package workshop07;

import java.util.ArrayList;

public class MakeList {
	ArrayList<Integer> list;

	public MakeList() {
		list = new ArrayList<>();	// 기본 생성자 사용하며 리스트 하나 넣어줌
	}
	
	public void makeArrayList(int size) {
		for (int i = 0; i < size; i++) {
			list.add((int)((Math.random()*10) + 10));	// 리스트에 난수 저장
		}
	}

	public ArrayList<Integer> getList() {
		// TODO Auto-generated method stub
		return list;
	}

	public double getAverage() {
		double result = 0.0;
		double sum = 0;
		
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		result = sum/list.size();
		return result;
	}
}
