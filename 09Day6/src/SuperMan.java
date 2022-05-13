
public class SuperMan implements Flyer {
	@Override
	public void takeOff() {
		System.out.println("슈퍼맨가 이륙한다.");
	}
	@Override
	public void land() {
		System.out.println("슈퍼맨가 착륙한다.");
	}
	@Override
	public void fly() {
		System.out.println("슈퍼맨가 날아간다..");
	}
}
