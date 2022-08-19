package Exercise;

import java.util.Scanner;

public class Exercise33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("윤년인지를 확인할 연도를 입력하세요: ");
		int year = scanner.nextInt();
		
		scanner.close();
		
		if( ((year%4==0) && !(year%100==0)) || year%400==0) {
		System.out.println( year + "년은 윤년이 맞습니다.");
		} else {
			System.out.println( year + "년은 윤년이 아닙니다.");
		}
	}
	}


/*
 * 윤년은 4의 배수여야 하고, 100의 배수는 아니어야 한다.
 * 또한 400의 배수는 무조건 윤년이 된다.
 * 
 * String leapYear = ((year%4==0) && (year%100 !=0)) ? "윤년입니다." : ((year%400==0) ? "윤년입니다." : "윤년이 아닙니다.");
 * System.out.println("%d년은 %s, year, leapYear);
 *  */
