package Exercise;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���. \n���α׷��� ����: ");
		double exam1 = scanner.nextDouble();
		
		System.out.print("�����ͺ��̽�: ");
		double exam2 = scanner.nextDouble();
		
		System.out.print("ȭ�� ����: ");
		double exam3 = scanner.nextDouble();
		
		System.out.print("���ø����̼� ����: ");
		double exam4 = scanner.nextDouble();
		
		System.out.print("�ӽŷ���: ");
		double exam5 = scanner.nextDouble();
		
		double sum = exam1 + exam2 + exam3 + exam4 + exam5;
		System.out.printf("����: %d\n", (int)sum);  // 91p ���� ���ڿ� ���
		
		double average = (double)(sum/5);
		System.out.printf("���: %-10.2f\n", average); // 91p ���� ���ڿ� ���
		
		if(average >= 90) {
			System.out.println("����: A");
		} else if((average >= 80) && (average < 90)) {
			System.out.println("����: B");
		} else if((average >= 70) && (average < 80)) {
			System.out.println("����: C");	
		} else if((average >= 60) && (average < 70)) {
			System.out.println("����: D");
		} else
		System.out.println("����: F");
		
		scanner.close();
	}
}

/*  90�� �̻� A
	80�� �̻� 90�� �̸� B
	70�� �̻� 80�� �̸� C
	60�� �̻� 70�� �̸� D
	60�� �̸� F
*/