package chapter02;

public class study {
	public static void main(String[] args) {
		
		double var1 = 3.5;
		double var2 = 2.7;
		int result = (int)(var1 + var2);
		System.out.println(result);
		
		long var3 = 2L;
		float var4 = 1.8f;
		double var5 = 2.5;
		String var6 = "3.9";
		int result2 = (int) (var3 + var4 + var5 + (int)Double.parseDouble(var6));
		System.out.println(result2);

	String str1 = 2 + 3 + "";
	String str2 = 2 + "" + 3;
	String str3 = "" + 2 + 3;
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	
	byte value1 = Byte.parseByte("10");
	System.out.println(value1);
	int value2 = Integer.parseInt("1000");
	System.out.println(value2);
	float value3 = Float.parseFloat("20.5");
	System.out.println(value3);
	double value4 = Double.parseDouble("3.14159");
	System.out.println(value4);
	}
}

