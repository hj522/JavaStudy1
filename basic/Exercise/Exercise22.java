package Exercise;

import java.util.Scanner;

public class Exercise22 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double distance = 40e12;
		double speed = 300000;
		double time = 31536000; // (60 * 60 * 24 * 365) ��
		double result = (distance / speed) / time;
		
		System.out.println("���� �ӵ��� ���Ͻø� ��Ÿ�츮 ������ ���µ� �ɸ��� �ð��� " + result + "�����̴�.");
	}
}

/*
 *double result = distance / speed; �� �ϸ� 1.33333333333333333E8(?) �� ������ ����� ��
 *�� ������ �� ������ �ٲپ�� ��
 *(60 * 60 * 24 * 365) <- 1�⿡ �ش��ϴ� ��
 *double result = distance / speed / 60 / 60 / 24 / 365; �� ���
 */
