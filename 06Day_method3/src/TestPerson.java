
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person("홍길동", 20, "aa@naver.com");
		Person pp = new Person("이순신", 10, "bb@gmail.com");
		System.out.println(p);
		System.out.println(pp);
		
		System.out.println("==========================");
		
		p.setAge(40);
		pp.setEmail("bb@naver.com");
		System.out.println(p);
		System.out.println(pp);
		
		System.out.println("==========================");
		
		int age1 = p.getAge();
		int age2 = pp.getAge();
		if(age1 == age2) System.out.println("나이 같음");
		else System.out.println("나이 다름");
		
		System.out.println("==========================");
		
		if(p.getName().equals(pp.getName())) System.out.println("이름 같음");
		else System.out.println("이름 다름");
		
	}

}
