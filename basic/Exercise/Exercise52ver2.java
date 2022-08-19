package Exercise;

import java.util.Arrays;
import java.util.Random;

public class Exercise52ver2 {
	public static void main(String[] args) {

		int[] numbers = new int[45];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1; // 1~45
		}
	
		Random random = new Random();
		for(int i = 0; i < numbers.length; i++) {
			int ranNum = random.nextInt(45);
			
			int temp = numbers[i];
			numbers[i] = numbers[ranNum];
			numbers[ranNum] = temp;
					
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.print(numbers[i] + " ");
	}
}
}
//		int tmp = 0;
//		int b = 0;
//		
//		for(int i=0; i<lotto.length; i++) { 
//			Random random = new Random();
//			lotto[i] = (int)random.nextInt(45) + 1;
//
//		int tmp = lotto[i];
//		int lotto[i] = b; 
//		int b = tmp;
//		
//			System.out.print(lotto[i] + " ");
//	}
//}

	
//로또번호 생성 프로그램 만들기 (1~45번. 중복 없이 출력)
