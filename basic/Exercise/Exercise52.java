package Exercise;

import java.util.Arrays;
import java.util.Random;

public class Exercise52 {
	public static void main(String[] args) {

		int[] lotto = new int[6];

		for(int i=0; i<lotto.length; i++) { 
			Random random = new Random();
			lotto[i] = (int)random.nextInt(45) + 1;
			
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
			}
		}
	}
		for(int i=0; i<lotto.length; i++)
		System.out.print(lotto[i] + " ");
}
}

// �ζǹ�ȣ ���� ���α׷� ����� (1~45��. �ߺ� ���� ���)
