package cafe;

public class Cafe {

	private int index=0;
	private Coffee [] coffeeList = new Coffee[10];
	
	public Cafe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Coffee[] getCoffeList() {
		return coffeeList;
	}

	public void setCoffeeList(Coffee coffee) {
		if(index < 10) {
			coffeeList[index] = coffee;
			index++;
		} else {
			System.out.println("정보가 추가될 수 없습니다.");
		}
	}
	
	public int totalPrice() {
		int total = 0;
		for (int i = 0; i < index; i++) {
			total += coffeeList[i].getPrice();
		}
		return total;
	}
}
