package Exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num;
		int answer;
		int chance = 0; // 정답 입력한 횟수 -> 루프 카운터 변수처리
		
		Random random = new Random();
		answer = random.nextInt(100) + 1;
			
		do {
			System.out.print("1부터 100사이의 정수 중 하나를 선택하세요: ");
			num = scanner.nextInt();
			chance++; //시도할 때마다 플러스 될 수 있도록 do 반복실행문에 추가 
			
			if(answer > num) {
				System.out.println("정답은 더 큰 수입니다.");	
			} else if(answer < num) {
				System.out.println("정답은 더 작은 수 입니다.");
			}
				
		} while(num!=answer);
		System.out.print("정답입니다.\n" + chance + "번만에 맞히셨습니다.");
			
		scanner.close();
	}
	
}


