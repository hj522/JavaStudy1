package chapter03;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이디:");
		String name = scanner.nextLine();
		
		System.out.println("패스워드:");
		String strPassword = scanner.nextLine();
		int password =Integer.parseInt(strPassword);
		
		scanner.close();
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패:패스워드가 틀림");
			} 
		} else {
			System.out.println("로그인 실패:아이디 존재하지 않음");
		}
	}
}
		
/*
 * 아이디가 java 패스워드가 12345 라면 "로그인 성공" 출력
 * 그렇지 않으면 "로그인 실패" 가 출력이 되도록 코드 짜기
 */
