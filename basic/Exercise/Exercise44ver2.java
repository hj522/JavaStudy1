package Exercise;

import java.util.Scanner;

public class Exercise44ver2 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가위 바위 보 게임");
		
		System.out.print("철수: ");
		String boy = scanner.nextLine();
		
		System.out.print("영희: ");
		String girl = scanner.nextLine();
		
		String result = "";
		
		if(boy.equals(girl)) {
			result = "무승부";
		} else if (boy.equals("가위") && girl.equals("보") || boy.equals("보") && girl.equals("바위") || boy.equals("바위") && girl.equals("가위")) {
			result = "철수 승리!";
		} else {
			result = "영희 승리!";
}
		System.out.println("결과: " + result);
		
		scanner.close();
}
}

// 시험 문제로 나오니 암기할 것
