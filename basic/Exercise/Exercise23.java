package Exercise;

import java.util.Scanner;

public class Exercise23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����� �ظ��� �������� �Է��Ͻÿ�.(����: cm): "); // ln �����
		double value1 = scanner.nextDouble(); //radius
		
		System.out.println("������� ���̸� �Է��Ͻÿ�.(����: cm) ");
		double value2 = scanner.nextDouble(); //height
		
		double value3 = (value1 * value1) * Math.PI; //area
		double value4 = value3 * value2; //volume
		
		System.out.println("����� �ظ��� ���̴� " + value3 + "���̰�, "
				+ "������� ���Ǵ� " + value4 + "���̴�.");
		
	}

}

/*
 * System.out.printf("����� �ظ��� ����: %f���̰�, ����: %f���̴�.", area, volume);
 * scanner.close();
 */