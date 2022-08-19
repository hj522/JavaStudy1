package chapter02;

import java.util.Scanner;

public class inputExample {
	public static void main(String[] args) {
		// Scanner를 이용해서 데이터 입력 받기
		Scanner scanner = new Scanner(System.in); //ctrl+1
		
		int value1 = scanner.nextInt();
		
		scanner.close();
	}
}
