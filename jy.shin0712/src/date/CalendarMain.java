package date;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain {

	public static void main(String[] args) {
		// 1989년 9월 26일을 Calendar 객체로 만들기
		Calendar birthDay = Calendar.getInstance();
		birthDay.set(Calendar.YEAR, 1989);
		birthDay.set(Calendar.MONTH, 8);
		birthDay.set(Calendar.DAY_OF_MONTH, 26);
		Date date = new Date(birthDay.getTimeInMillis());
		System.out.println(date);
		
		Calendar toDay=Calendar.getInstance();
		long gap=toDay.getTimeInMillis()-birthDay.getTimeInMillis();
		System.out.println("내가 태어난 지 "+(gap/24/60/60/1000)+"일 때 되는 날입니다");
		
		
	}

}
