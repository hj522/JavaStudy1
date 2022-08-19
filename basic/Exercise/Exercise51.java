package Exercise;

public class Exercise51 {
	public static void main(String[] args) {
		
		int[] array = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
		int max = 0; // Integar.MIN_VALUE;
		int min = array[0]; // Integer.MAX_VALUE;
		
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
			
			if(min > array[i]) {
				min = array[i];
				}
		}
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}
}
