package ezen.api;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class CalendarExample {

	public static void main(String[] args) {
		// Calendar 클래스는 추상클래스이므로 생성할 수 없다.
//		Calendar today = new Calendar();
//		Calendar today = new GregorianCalendar(); // Calendar라는 추상클래스는 GregorianCalendar클래스로 이미 구현되어있다.
//		Calendar today2 = new GregorianCalendar(); 
//		Calendar today3 = new GregorianCalendar();  //객체가 3개 만들어짐. 비효율 날짜는 하나생성해서 돌려쓰기가능 (Static메소드로 생성), 싱글톤X

		// Calendar 클래스 싱글톤 디자인 패턴이 적용된 대표적인 클래스이다.
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.println(today.getCalendarType());
//		Calendar today1 = Calendar.getInstance();
//		Calendar today2 = Calendar.getInstance();
//		System.out.println(today == today2); 

		// get(상수)를 이용하여 calendar의 필요한 날짜, 시간정보를 얻는다.
		int year = today.get(Calendar.YEAR);
		System.out.println(year);
		int month = today.get(Calendar.MONTH) + 1; // MONTH는 0부터 시작이라서 +1해줘야함, DATE는 1부터시작
		System.out.println(month);
		int date = today.get(Calendar.DATE);
		System.out.println(date);

		System.out.println();
		
		int hour = today.get(Calendar.HOUR);
		System.out.println(hour);
		int hourOfDay = today.get(Calendar.HOUR_OF_DAY);
		System.out.println(hourOfDay);

		System.out.println();
	
		int am_pm = today.get(Calendar.AM_PM);
		System.out.println(am_pm);
		if (am_pm == Calendar.AM) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}

		int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		switch (dayOfWeek) {
		case Calendar.MONDAY:
			System.out.println("월");
			break;
		case Calendar.TUESDAY:
			System.out.println("화");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("수");
			break;
		case Calendar.THURSDAY:
			System.out.println("목");
			break;
		case Calendar.FRIDAY:
			System.out.println("금");
			break;
		case Calendar.SATURDAY:
			System.out.println("토");
			break;
		case Calendar.SUNDAY:
			System.out.println("일");
			break;
		default:
			break;
		}

		// 특정날짜
		today.set(1987, 2, 1); // 1987.3.1 월 0부터 시작인거 주의!! 설정할때는 -1 가져올때는 +1
		String ymd = today.get(Calendar.YEAR) + "." + (today.get(Calendar.MONTH) + 1) + "." + today.get(Calendar.DATE); 
		// +연산자는 문자열이 우선순위라서 괄호해줌.
		// +연산자말고 StringBuilder append 메소드 써도됨
		System.out.println(ymd);

		Date datee = today.getTime();
		System.out.println(datee.toLocaleString());

		// 1970.1.1 0시0분0초 ~ 1987.3.1 까지의 밀리세컨드
		long mt = today.getTimeInMillis();
		System.out.println(mt / (1000 * 60 * 60 * 24));

		String hireDate = "1987.3.1";
		String finalDate = "2023.1.15";
		int workDays = getWorkDays(hireDate, finalDate);
		System.out.println("근무일수 : " + workDays);

	}

	public static int getWorkDays(String hireDate, String finalDate) {
		// 며칠을 근무했는지 반환
		int workDay = (int)(CalendarExample.getDates(finalDate)/(1000 * 60 * 60 * 24) - CalendarExample.getDates(hireDate)/(1000 * 60 * 60 * 24));
		return workDay;
	}

	private static long getDates(String date) {
		StringTokenizer transform = new StringTokenizer(date, ".");
		while (transform.hasMoreTokens()) {
			int yyy = Integer.parseInt(transform.nextToken());
			int mmm = Integer.parseInt(transform.nextToken());
			int ddd = Integer.parseInt(transform.nextToken());
			Calendar calendar = Calendar.getInstance();
			calendar.set(yyy, mmm, ddd);
			long millis = calendar.getTimeInMillis();
			return millis;
		}
		return 0;
	}
}
