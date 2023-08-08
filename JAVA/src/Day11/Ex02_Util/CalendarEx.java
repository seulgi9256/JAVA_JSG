package Day11.Ex02_Util;

import java.util.Calendar;

public class CalendarEx {
	
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; 			// 월 (0~11)
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); 		// 일~토(1~7)
		int hour = cal.get(Calendar.HOUR);					// 12시 표시
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);		// 24시 표시
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		
		System.out.println(msg + " : " + year + "/" + month + "/" + day + "/");
		
		// 일요일(1) ~ 토요일(7)
		String Day = "";
		
		switch(dayOfWeek) {
		case Calendar.SUNDAY 	:	Day = "일요일"; break;
		case Calendar.MONDAY 	:	Day = "월요일"; break;
		case Calendar.TUESDAY 	:	Day = "화요일"; break;
		case Calendar.WEDNESDAY :	Day = "수요일"; break;
		case Calendar.THURSDAY 	:	Day = "목요일"; break;
		case Calendar.FRIDAY 	:	Day = "금요일"; break;
		case Calendar.SATURDAY 	:	Day = "토요일"; break;
		}
		System.out.print(Day);
		System.out.print("(" + hourOfDay + ")");
		if(ampm == Calendar.AM)
			System.out.print("오전");
		if(ampm == Calendar.PM)
			System.out.print("오후");
		
		System.out.println(hour + "시 " + minute + "분 " + second + "초 "+ millisecond + "밀리초");
	}
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		printCalendar("현재 ", now);
		
	}
}
