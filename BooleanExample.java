
public class BooleanExample {
	public static void main (String[] args) {
		boolean isTrue = false;
		isTrue = true;
		
		int num1, num2;
		num1 = 19;
		num2 = 29;
		
		isTrue = num1 > num2 ;
		
		if (isTrue) {
			System.out.println("num1 is larger than num2");
		} else {
			System.out.println("num2 is larger than num1");
		}
	}	
}