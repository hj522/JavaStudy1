package chapter04;

import java.util.Random;

public class IfDiceExample {
	public static void main(String[] args) {
	
//	int num = (int) (Math.random() * 6) + 1; // �ֻ��� ��ȣ �ϳ� �̱�
		
	Random random = new Random();
	int num = random.nextInt(6) + 1;
	
	if(num==1) {
		System.out.println("1���� ���Խ��ϴ�.");
	} else if(num==2) {
		System.out.println("2���� ���Խ��ϴ�.");
	} else if(num==3) {
		System.out.println("3���� ���Խ��ϴ�.");
	} else if(num==4) {
		System.out.println("4���� ���Խ��ϴ�");
	} else if(num==5) {
		System.out.println("5���� ���Խ��ϴ�.");
	} else {
		System.out.println("6���� ���Խ��ϴ�.");
	}
}
}

/*

<���� ���� �����>

1. ���� ���� ���
int randomNum = (int) (Math.random() * �Ѱ���) + ���ۼ���;

2. ���� ���
Random random = new Random();
int randomNum = random.nextInt(�Ѱ���) + ���ۼ���;

3. ���� ����
SecureRandom secureRandom = new SecureRandom();
int randomNum = secureRandom.nextInt(�Ѱ���) + ���ۼ���;

 */
