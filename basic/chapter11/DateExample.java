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
		SimpleDateFormat format = new SimpleDateFormat("yyyy�� mm�� dd��");
		System.out.println(format.format(date));
		
		// Calendar
		Calendar calendar = Calender.getInstance(); // �̱��� ����.. ���� ��Ÿ��
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int dayOfMonth = calendar.get(Calendar.DATE);
		System.out.println(year + "�� " + month + "�� " + dayOfMonth + "��");
		
		// LocalDateTime���� ����
		// method chaining ��� => Value Object(V0)�� ���� �� Builder Pattern���� ����� �Ͱ� ����
		String.format.System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy�� mm�� dd�� E���� hh:mm:ss)))";
		System.out.println();
	}
}
