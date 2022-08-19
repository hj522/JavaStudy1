package chapter05;

public class Q5 {
	public static void main(String[] args) {
		int[][] array = {
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0; // 돌아가는 횟수 카운팅(배열 숫자 개수 알 수 있음)
		
		for (int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
			count++;
		}
	}
		avg = sum / (double)count;

		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
