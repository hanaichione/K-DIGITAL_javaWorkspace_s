

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest2 {
	public static void main(String[] args) throws Exception {
		
		// 날짜 데이터
		// 1. java.util.Date
		Date d = new Date();
		System.out.println(d);
		
		// 날짜를 특정 포맷으로 나타내기
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		String mesg = sdf.format(d);
		System.out.println(mesg);
		
		
		System.out.println("======================");
		
		// 특정 포맷으로 쓰인 날짜를 원래 형태로 뽑아오기
		SimpleDateFormat sdf2 =
				new SimpleDateFormat("yyyy년 MM월 dd일");
		Date d2 = sdf2.parse("2020년 10월 16일");
		System.out.println(d2);
	}
}
