package chapter01;

public class loop02 {
	public static void main(String[] args) {

		/* while문을 사용하여 다음과 같이 출력해보자
		   kor의 평균: 90
		   eng의 평균: 90 */
		
		//과목: kor, eng

		int i = 0;
		int sum = 0;
		
		int[][] jumsuArr = {
				{90,80},
				{95,75},
				{100,95},
				{95,85},
				{80,100}
		};
		
		while(i<jumsuArr[0].length) {
			sum = sum + jumsuArr[0][i];
			i++;
		}
				
		System.out.println("kor의 평균: " + (double)sum / jumsuArr[0].length);
		
		while(i<jumsuArr[1].length) {
			sum = sum + jumsuArr[1][i];
			i++;
		}
		
		System.out.println("eng의 평균: " + (double)sum / jumsuArr[1].length);
	}
}
