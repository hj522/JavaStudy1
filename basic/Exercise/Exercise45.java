package Exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num;
		int answer;
		int chance = 0; // ���� �Է��� Ƚ�� -> ���� ī���� ����ó��
		
		Random random = new Random();
		answer = random.nextInt(100) + 1;
			
		do {
			System.out.print("1���� 100������ ���� �� �ϳ��� �����ϼ���: ");
			num = scanner.nextInt();
			chance++; //�õ��� ������ �÷��� �� �� �ֵ��� do �ݺ����๮�� �߰� 
			
			if(answer > num) {
				System.out.println("������ �� ū ���Դϴ�.");	
			} else if(answer < num) {
				System.out.println("������ �� ���� �� �Դϴ�.");
			}
				
		} while(num!=answer);
		System.out.print("�����Դϴ�.\n" + chance + "������ �����̽��ϴ�.");
			
		scanner.close();
	}
	
}


