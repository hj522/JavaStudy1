package chapter05;

public class Q4 {
	public static void main(String[] args) {
		
		int max = 0; // 0��� Integer.MIN_VALUE; �� ������ ���� 
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
 * for���� �̿��Ͽ� �迭 �ִ밪 ���ϱ�
 * 
 */