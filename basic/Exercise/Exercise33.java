package Exercise;

import java.util.Scanner;

public class Exercise33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���������� Ȯ���� ������ �Է��ϼ���: ");
		int year = scanner.nextInt();
		
		scanner.close();
		
		if( ((year%4==0) && !(year%100==0)) || year%400==0) {
		System.out.println( year + "���� ������ �½��ϴ�.");
		} else {
			System.out.println( year + "���� ������ �ƴմϴ�.");
		}
	}
	}


/*
 * ������ 4�� ������� �ϰ�, 100�� ����� �ƴϾ�� �Ѵ�.
 * ���� 400�� ����� ������ ������ �ȴ�.
 * 
 * String leapYear = ((year%4==0) && (year%100 !=0)) ? "�����Դϴ�." : ((year%400==0) ? "�����Դϴ�." : "������ �ƴմϴ�.");
 * System.out.println("%d���� %s, year, leapYear);
 *  */
