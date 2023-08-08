package Day11.Ex02_Util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarEx2 {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		System.out.println( cal.get(Calendar.YEAR));
		System.out.println( cal.get(Calendar.MONTH) +1);
		System.out.println( cal.get(Calendar.DAY_OF_MONTH));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String today = sdf.format(cal.getTime());
		System.out.println(today);
		
		// 10분후
		cal.add(cal.MINUTE, 10);
		String afterMin = sdf.format(cal.getTime());
		System.out.println(afterMin);
		
		// 1시간 후
		cal.add(cal.HOUR, 1);
		String afterHour = sdf.format(cal.getTime());
		System.out.println(afterHour);
		
		// 1일 후
		cal.add(cal.DAY_OF_MONTH, 1);
		String afterDay = sdf.format(cal.getTime());
		System.out.println(afterDay);
		
		System.out.println();
		// 이번 주 로또 추첨일시 ?
		// 매일 6시부터 24시까지 판매
		// 추첨일(토요일)에는 오후 8시까지만 판매 마감
		// 추첨일 오후 8시부터 다음날(일요일) 오전 6시까지는 판매 정지
		// 조건
		// 일요일 오전 6시 ~ 토요일 오후 8시 구매 : 이번주 토요일 오후 9시
		
		Calendar lottoCal = Calendar.getInstance();
		// 날짜 변경
		lottoCal.set(Calendar.DAY_OF_MONTH, 13);
//		lottoCal.set(Calendar.AM_PM, 0);
//		lottoCal.set(Calendar.HOUR, 2);
		
		int 요일 = lottoCal.get((Calendar.DAY_OF_WEEK));
		int 시간 = lottoCal.get((Calendar.HOUR));
		int ampm = lottoCal.get((Calendar.AM_PM));
		String todayOfWeek = "";
		
			switch (요일){
				case 1 : todayOfWeek = "일"; break;
				case 2 : todayOfWeek = "월"; break;
				case 3 : todayOfWeek = "화"; break;
				case 4 : todayOfWeek = "수"; break;
				case 5 : todayOfWeek = "목"; break;
				case 6 : todayOfWeek = "금"; break;
				case 7 : todayOfWeek = "토"; break;
			}
			System.out.println(요일);
			System.out.println(시간);
			System.out.println(ampm);				// 0 : 오전, 1 : 오후
			System.out.println(todayOfWeek);
			
			String 구매일 = sdf.format(lottoCal.getTime());
			System.out.println("구매일 : " + 구매일);
			
			// 시간은 고정 : 오후 9시 00분 00초
			lottoCal.set(Calendar.AM_PM, 1);
			lottoCal.set(Calendar.HOUR, 9);
			lottoCal.set(Calendar.MINUTE, 0);
			lottoCal.set(Calendar.SECOND, 0);
			

		
			boolean buyYn = false;
			
			if((ampm==0 && 시간 < 6)&&(ampm==0 && 시간 >= 0)){
				System.out.println("구입불가");
			}
			// 1. 토요일이면서, 오후 8시 이후 - 구입 불가
			else if(todayOfWeek.equals("토") && ampm == 1 && 시간 >= 8) {
				System.out.println("구입불가");
			}
			// 2. 일요일이면서, 오전 6시 이전 - 구입 불가
			else if(todayOfWeek.equals("일") && ampm == 0 && 시간 <= 6) {
				System.out.println("구입불가");
			}
			// 3. 일요일이면서, 오전 6시 이후 - 다음주 토요일 9시가 추첨일시
//			else if(todayOfWeek.equals("일") && ampm == 1 && 시간 > 6) {
//				
//			}
			// 4. 그 외, 이번주 토요일 9시가 추첨일시 [+(7-요일)]
			else {
				lottoCal.add(Calendar.DATE, (7-요일)); 		// (7-요일) 후
				buyYn = true;
			}
			
			if( buyYn = true) {
				String 추첨일 = sdf.format(lottoCal.getTime());
				System.out.println("추첨일 : " + 추첨일);
			}
			else
				System.out.println("구매 할 수 없는 시간입니다.");
	}
}
