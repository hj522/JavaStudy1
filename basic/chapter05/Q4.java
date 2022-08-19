package chapter05;

public class Q4 {
	public static void main(String[] args) {
		
		int max = 0; // 0대신 Integer.MIN_VALUE; 를 넣으면 좋음 
		int[] array = { 1, 5, 3, 8, 2 };
		int min = array[0]; // Integer.MIN_VALUE;
		
		for(int i=0; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
			if(array[i] < min) {
			min = array[i];
		
		// int min = max	
	//	for(int i=0; i<array.length; i++)
			}
			
		System.out.println("max: " + max);
		System.out.println("min: " + min);
}
}
}

/*
 * for문을 이용하여 배열 최대값 구하기
 * 
 */