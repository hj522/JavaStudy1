package chapter11;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateExample {
	public static void main(String[] args) {
		
		// Date
		Date date = new Date();
		
		// 2022-07-05
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 mm월 dd일");
		System.out.println(format.format(date));
		
		// Calendar
		Calendar calendar = Calender.getInstance(); // 싱글톤 형식.. 옛날 스타일
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int dayOfMonth = calendar.get(Calendar.DATE);
		System.out.println(year + "년 " + month + "월 " + dayOfMonth + "일");
		
		// LocalDateTime으로 변경
		// method chaining 방식 => Value Object(V0)를 만들 때 Builder Pattern으로 만드는 것과 동일
		String.format.System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy년 mm월 dd일 E요일 hh:mm:ss)))";
		System.out.println();
	}
}
