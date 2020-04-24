
public class LongExample {
	public static void main (String[] args) {
		long num1 = 100;
		long num2 = 20L;
		long num3 = 1000000000000L;
		
		int num4 = Integer.MAX_VALUE; // 2147483647
		int num5 = 1;
		num4 = 214748364;
		
		if (num4 <= Integer.MAX_VALUE - num5) {
			int result = num4 + num5;
			System.out.println("result: " + result);
		} else {
			System.out.println("overflow maxvalue");	
		}	
		
		int num6, num7;
		num6 = 2000000000;
		num7 = 2;
		
		if (num6 <= Integer.MAX_VALUE / num7) {
			int result = num6 * num7;
			System.out.println("result: " + result);
		} else {
			System.out.println("overflow maxvalue");
		}	
	}	
}