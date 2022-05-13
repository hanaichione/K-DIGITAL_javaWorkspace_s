package cafe;

public class CafeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cafe cafe = new Cafe();
		
		
		cafe.setCoffeeList(new Coffee("Americano", 4000));
		cafe.setCoffeeList(new Coffee("Caffelatte", 5000));
		cafe.setCoffeeList(new Coffee("Macchiato", 6000));
		cafe.setCoffeeList(new Coffee("Caffemocha", 6000));
		cafe.setCoffeeList(new Coffee("Strawberrylatte", 6500));
		cafe.setCoffeeList(new Coffee("Milktea", 6500));
		cafe.setCoffeeList(new Coffee("Blacksesamelatte", 6500));
		cafe.setCoffeeList(new Coffee("Greentealatte", 6500));
		cafe.setCoffeeList(new Coffee("Chocolatte", 6500));
		cafe.setCoffeeList(new Coffee("Blueberrysmoothie", 7000));
		cafe.setCoffeeList(new Coffee("Peachsmoothie", 7000));
		
		System.out.println(cafe.totalPrice());
		Coffee [] arr = cafe.getCoffeList();
		for (Coffee coffee : arr) {
			System.out.println(coffee);
		}
	}

}
