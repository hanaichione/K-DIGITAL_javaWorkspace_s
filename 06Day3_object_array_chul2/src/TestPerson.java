
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person [] p = new Person[3];
		
		Person p1 = new Person("홍길동", 10);
		Person p2 = new Person("이순신", 20);
		Person p3 = new Person("유관순", 30);
		
		p[0] = p1;
		p[1] = p2;
		p[2] = p3;
		
		for (Person person : p) {
			System.out.println(person);
		}
	}

}
