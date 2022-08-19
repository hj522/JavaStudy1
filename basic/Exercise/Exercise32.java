package Exercise;

import java.util.Scanner;

public class Exercise32 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수도입니까?(수도: 1, 수도아님: 0)");
		int num1 = scanner.nextInt();
		
		System.out.print("총 인구는?(단위: 만)");
		int num2 = scanner.nextInt(); // 100만 이상
		
		System.out.print("연소득이 1억 이상인 인구는?(단위: 만)");
		int num3 = scanner.nextInt(); // 50만 이상
		
		scanner.close();
		
		String result = (num1 == 1 & num3 >= 50 || num2 >= 100) ? "이 도시는 메트로폴리스입니다." : "X";
		System.out.println(result);
		
	}
}

/* 삼항연산자 사용하여 풀 것
 * 한 나라의 수도이고, 인구가 100만 이상이어야 한다.
 * 연소득이 1억 이상인 인구가 50만 이상이어야 한다.
 * 위 두 조건 중 1개라도 맞으면 메트로폴리스
 */

