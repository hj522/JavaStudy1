package chapter04;

public class Q5 {
	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}

// int i; → 아래로 출력 / int j; → 옆으로 출력