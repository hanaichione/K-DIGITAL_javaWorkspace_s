// ************ 패턴 암기 *************
public class WhileTest2 {

	public static void main(String[] args) {
		
//		int num = 1;
//		int sum = 0;
//		while(num <= 10) {
//			sum += num;
//			num++;
//		}
//		System.out.println("누적합계:"+sum);
		
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.println("누적합계:"+sum);
		
		int num = 1;
		int sum = 0;
		while (num <= 10) {
			if (num%2==0) {
				sum += num;
				System.out.println("sum = "+sum+"num = "+num);
			}
			num++;
		}
		System.out.println("누적합계:"+sum);
	}
}
