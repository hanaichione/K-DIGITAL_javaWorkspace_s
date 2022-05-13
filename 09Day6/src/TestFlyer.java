
public class TestFlyer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flyer b = new Bird();
		b.takeOff();
		b.fly();
		b.land();
		
		Flyer m = new SuperMan();
		m.takeOff();
		m.fly();
		m.land();
		
		Flyer a = new Airplane();
		a.takeOff();
		a.fly();
		a.land();
	}

}
