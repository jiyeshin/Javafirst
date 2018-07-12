package date;

import java.text.*;
import java.util.Date;

public class FormatMain {

	public static void main(String[] args) {
		Date date=new Date();
		int money=6548000;
		
		//0000년 00월 00일 0요일 00시 00분 00초 형식으로 출력
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 EEEE a hh시 mm분 ss초");
		String msg=sdf.format(date);
		System.out.println(msg);
		
		
		//통화기호 6,548,000 형식으로 출력
		DecimalFormat df=new DecimalFormat("\u00A4 #,##0");
		msg=df.format(money);
		System.out.println(msg);
		
	}

}
