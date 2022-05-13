import java.util.Arrays;

class Counter{
	
	private int num;
	private static int count;
	
	public Counter() {
		num++;
		count++;
	}
	
	public int getNum() {return num;}
	public int getCount() {return count;}
	
	public static int getCount2() {
		return count;
	}
}

	
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Counter.getCount2());
		// 객체 생성 없이도 사용 가능한 static 함수
		
		int x = Integer.parseInt("10");
		float x2 = Float.parseFloat("3.14");
		double x3 = Double.parseDouble("3.14");
		
		String y = String.valueOf(10);
		int [] k = {10,2,3,5,6};
		Arrays.fill(k, 100);
		
		Counter c = new Counter();	// count, num 하나씩 증가 1
		System.out.println("count "+c.getCount());	// 1
		System.out.println(c.getNum());	// 1
		Counter c2 = new Counter();	// count 증가 2, num 은 증가하지 않음
		System.out.println("count "+c.getCount()); // 2
		System.out.println(c.getNum());
		
	}
}
