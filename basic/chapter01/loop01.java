package chapter01;

public class loop01 {

	public static void main(String[] args) {
		int[] jumsu = {85,90,70,75,100,95,95,80,75,85};
		int i = 0;
		int sum = 0; // ��������
		
		// jumsu�� ����� ���غ���(while������ ó��)
		// ���: ��ü���� / ����
		// jumsu[0]: 85 / jumsu[1]: 90 / jumsu[2]: 70
		// .... jumsu[9]: 85
		
		while(i<jumsu.length) { //i : 0~9���� �ݺ�
			sum = sum + jumsu[i];
			i++; // 0~9���� �ݺ�. �ᱹ i�� 10�� ��
			
		}
		
		// 85.0			
		System.out.println((double)sum / jumsu.length);
			
		}

	}
