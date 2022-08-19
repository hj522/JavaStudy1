package chapter01;

public class loop01 {

	public static void main(String[] args) {
		int[] jumsu = {85,90,70,75,100,95,95,80,75,85};
		int i = 0;
		int sum = 0; // 누적변수
		
		// jumsu의 평균을 구해보자(while문으로 처리)
		// 평균: 전체의합 / 개수
		// jumsu[0]: 85 / jumsu[1]: 90 / jumsu[2]: 70
		// .... jumsu[9]: 85
		
		while(i<jumsu.length) { //i : 0~9까지 반복
			sum = sum + jumsu[i];
			i++; // 0~9까지 반복. 결국 i는 10이 됨
			
		}
		
		// 85.0			
		System.out.println((double)sum / jumsu.length);
			
		}

	}
