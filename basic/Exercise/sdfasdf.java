package Exercise;

public class sdfasdf {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87}; // 변수 선언..생성..
		
		System.out.println("scores[0] : " + scores[0]); // 83
		System.out.println("scores[1] : " + scores[1]); // 90
		System.out.println("scores[2] : " + scores[2]); // 87
		
		int sum = 0;
		for(int i=0; i<3; i++) { // 배열 개수 3개
			sum += scores[i];
		}
		
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
	}
}
