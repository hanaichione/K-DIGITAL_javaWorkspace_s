

import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		
		// 1. Date
		Date d = new Date();
		System.out.println("d=="+d);
		System.out.println("d.toString()=="+d.toString());
		
		@SuppressWarnings("deprecation")
		Date d2 = new Date(2019, 06, 18);	// deprecated
		System.out.println("d2=="+d2);		// Date가 제대로 출력되지 않음
		
		System.out.println("=======================================");
		
		// 2. Calendar
		Calendar c = Calendar.getInstance();		// singletone이라 생성된 걸 불러와서 사용
		System.out.println(c);
		System.out.println(c.toString());
		
		System.out.println("===================================================");
		System.out.println("년도: "+c.get(Calendar.YEAR));
		
		int month = c.get(Calendar.MONTH)+1;
		System.out.println("월 : "+month);
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("일 : "+day);
		
		int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일 : "+week);	// 일요일 1 토요일 7
		
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int seconds = c.get(Calendar.SECOND);
		System.out.println(hour+"\t"+minute+"\t"+seconds);
		
		System.out.println("==================================");
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2014, 11, 24);	// 1월 0 12월 11
		Date now = cal2.getTime();
		System.out.println(now);
		
		System.out.println("=1일 후=");
		cal2.add(Calendar.DATE, 1);
		System.out.println(cal2.getTime());
		System.out.println("=6달 전=");
		cal2.add(Calendar.MONTH, -6);
		System.out.println(cal2.getTime());
		
		Calendar cal3 = Calendar.getInstance();
		cal3.set(2021,9,9);
		System.out.println(cal3.getTime());
		cal3.add(Calendar.DATE, 200);
		System.out.println(cal3.getTime());
		
		System.out.println("==========================");
		
		// Calendar => Date
		Date xxxx = c.getTime();
		System.out.println(xxxx);
		
		long yyyy = c.getTimeInMillis();
		System.out.println(yyyy);
		
		long yyyy2 = System.currentTimeMillis();
		System.out.println(yyyy2);
		
	}
}
