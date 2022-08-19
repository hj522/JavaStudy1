package Exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {
	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		
		System.out.print("가위 바위 보를 입력하세요: ");
		String player = scanner.nextLine();
	
		String[] cpu = {"가위", "바위", "보"}; // 가위 바위 보는 문자라서 랜덤으로 돌리기가 불가능
		Random random = new Random();
		String computer = cpu[random.nextInt(3)]; // -> 배열의 인덱스 0~2를 이용해서 랜덤 출력

		// 처리
		
		String result = " ";
		
		if(player == computer) {
			result = ("게이머: " + player + "\n인공지능 컴퓨터: " + computer + "\n결과: 무승부!");
			System.out.println(result);
			
		} else if ((player.equals("가위") && computer.equals("보")) 
				|| (player.equals("보") && computer.equals("바위"))
				|| (player.equals("바위") && computer.equals("가위"))) {
			result = ("게이머: " + player + "\n인공지능 컴퓨터: " + computer + "\n결과: 플레이어 승리!");
			System.out.println(result);
			
		} else {
			result = ("게이머: " + player + "\n인공지능 컴퓨터: " + computer + "\n결과: 컴퓨터 승리!");
			System.out.println(result);
			
			scanner.close();
	}

}
}



/*
 * Scanner scanner = new Scanner(System.in);
 * Random random = new Random();
 * String gamer; //입력 받을 값
 * int aiNum = random.nextInt(3); // 0~2까지 랜덤수 돌리기
 * int gamStr=0; // 입력 값을 정수로 
 * System.out.println("가위 바위 보 게임");
 * System.out.print("게이머:");
 * gamer=scanner.nextLine();
 *
 * //사용자 가위바위보 문자를 0~2로 결정
 * if(gamer.equals("가위")) {
 * 	gamStr = 0;
 * } else if (gamer.equals("바위")) {
 * gamStr = 1;
 * } else if (gamer.equals("보")) {
 * gamStr = 2;
 * }
 * 
 * if(aiNum==0) {
 * System.out.println("인공지능 컴퓨터 : 가위");
 * } else if (aiNum ==1) {
 * System.out.println("인공지능 컴퓨터 : 바위");
 * } else if (aiNum==2) {
 * System.out.println("인공지능 컴퓨터 : 보");
 * }
 * 
 * 입력받은 gamStr 값을 랜덤 수와 비교
 * 
 * switch (gamStr) {
 * case 0:
 * 	if(aiNum==0) {
 *	System.out.print("비겼습니다.)";
 * } else if(aiNum==1) {
 * System.out.print("결과: 컴퓨터 승리!")
 * } else if(aiNum==2) {
 * System.out.print("게이머 승리");
 * }
 * break;
 * 
 *
 * case 1:
 *  	if(aiNum==0) {
 *	System.out.print("");
 * } else if(aiNum==1) {
 * System.out.print("")
 * } else if(aiNum==2) {
 * System.out.print("");
 * }
 * break;
 
 * 
 * case 2:
 *  	if(aiNum==0) {
 *	System.out.print("결과: 컴퓨터 승리!)";
 * } else if(aiNum==1) {
 * System.out.print("결과: 게이머 승리!")
 * } else if(aiNum==2) {
 * System.out.print("비겼습니다.");
 * }
 * break;
 */
