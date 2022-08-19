package chapter04;

import java.util.Random; 

public class Q3 {
	public static void main(String[] args) {
		
		while(true) {

			Random random = new Random();
			int i = random.nextInt(6) + 1; 
			int j = random.nextInt(6) + 1;
			
			System.out.println("(" + i + ", " + j + ")");
			
		int sum = i+j;
			
		if(sum == 5) {
			break;
		}
		
		}
	
	}
}


//		int i = (int) (Math.random() * 6) + 1;
//		int j = (int) (Math.random() * 6) + 1;