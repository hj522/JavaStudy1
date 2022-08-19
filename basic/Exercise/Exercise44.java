package Exercise;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("°¡À§ ¹ÙÀ§ º¸ °ÔÀÓ");
		
		System.out.print("Ã¶¼ö: ");
		String boy = scanner.nextLine();
		
		System.out.print("¿µÈñ: ");
		String girl = scanner.nextLine();
		
		if(boy.equals("°¡À§")) {
			if(girl.equals("°¡À§")) {
				System.out.println("°á°ú: ¹«½ÂºÎ");
		}	else if(girl.equals("¹ÙÀ§"))
				System.out.println("°á°ú: ¿µÈñ ½Â¸®!");
			else
				System.out.println("°á°ú: Ã¶¼ö ½Â¸®!");
		}
			
		else if(boy.equals("¹ÙÀ§")) {
			if(girl.equals("¹ÙÀ§")) {
			System.out.println("°á°ú: ¹«½ÂºÎ");
		}	else if(girl.equals("°¡À§"))
			System.out.println("°á°ú: Ã¶¼ö ½Â¸®!");
			else
			System.out.println("°á°ú: ¿µÈñ ½Â¸®!");
		}
		
		else if(boy.equals("º¸")) {
			if(girl.equals("º¸")) {
			System.out.println("°á°ú: ¹«½ÂºÎ");
		}	else if(girl.equals("°¡À§"))
			System.out.println("°á°ú: ¿µÈñ ½Â¸®!");
			else
			System.out.println("°á°ú: Ã¶¼ö ½Â¸®!");
		}
		
		scanner.close();
	}
}

// if ¹«½ÂºÎ
// else if Ã¶¼ö°¡ ÀÌ±â´Â °æ¿ì ´Ù Àû°í, Ã¶¼ö ½Â¸®
// else ³ª¸ÓÁö ¿µÈñ ½Â¸®

