package Exercise;

import java.util.Scanner;

public class Exercise32 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�����Դϱ�?(����: 1, �����ƴ�: 0)");
		int num1 = scanner.nextInt();
		
		System.out.print("�� �α���?(����: ��)");
		int num2 = scanner.nextInt(); // 100�� �̻�
		
		System.out.print("���ҵ��� 1�� �̻��� �α���?(����: ��)");
		int num3 = scanner.nextInt(); // 50�� �̻�
		
		scanner.close();
		
		String result = (num1 == 1 & num3 >= 50 || num2 >= 100) ? "�� ���ô� ��Ʈ���������Դϴ�." : "X";
		System.out.println(result);
		
	}
}

/* ���׿����� ����Ͽ� Ǯ ��
 * �� ������ �����̰�, �α��� 100�� �̻��̾�� �Ѵ�.
 * ���ҵ��� 1�� �̻��� �α��� 50�� �̻��̾�� �Ѵ�.
 * �� �� ���� �� 1���� ������ ��Ʈ��������
 */

