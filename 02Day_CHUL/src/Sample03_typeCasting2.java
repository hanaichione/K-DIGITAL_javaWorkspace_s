
public class Sample03_typeCasting2 {

	public static void main(String[] args) {
		
		// 데이터 타입 변경(명시적으로 형변환 시킨다.)
		// 큰타입 --> 작은 타입에 저장 시에는 반드시 명시적으로 형변환
		int n = 10;
		short n2 = (short)n;
		
		short x = 10;
		short x2 = 20;
		short x3 = (short)(x + x2);	// 주의 : 연산 후 자동 int로 변환
		// short x4 = (short)x + x2	// 오류 : short + short 하면 int이므로 
		
	}

}
