import java.util.Date;
// 묵시적으로 import java.lang.* 코드가 자동 삽입됨, 나머지는 명시적 코드 작성해야 함

public class Sample01_dataType {

	public static void main(String[] args) {
		long num = 100L; // long형 저장 시 값 뒤에 L, l 명시 (대문자 권장)
	//	byte num2 = 300; byte형은 -128 ~ 127까지 가능하기 때문에 오류 발생
		float num3 = 3.14F; // float형 저장 시 값 뒤에 F, f 명시
		
		System.out.println("\uD64D"); 	// 문자열, 반드시 ""
		System.out.println(100);		// 정수
		System.out.println(3.14);		// 실수, 3.14D와 동일
		System.out.println(3.14F);		// 실수, f와 동일
		System.out.println(3.14D);		// 실수, d와 동일
		System.out.println('\uD64D');
		
		System.out.println(true);		// 논리값(true, false)
		System.out.println(false);		// 논리값(true, false)
		// System.out.println(null); 	// null 값 가리키지 않는 것(참조하지 않음)
		Date d = new Date();			// d는 참조변수, Date()라는 개체를 참조 중
		System.out.println(d);
	}

}
