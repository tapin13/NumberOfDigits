
public class NumberOfDigits {

	public static void main(String[] args) {
		System.out.println("numberOfDigits(3456): " + numberOfDigits(3456));
		System.out.println("numberOfDigits(6534223): " + numberOfDigits(6534223));
		System.out.println("numberOfDigits(3): " + numberOfDigits(3));
	}
	
	public static int numberOfDigits(int n) {
		if(n > -10 && n < 10) {
			return 1;
		} else {
			return 1 + numberOfDigits(n / 10);
		}
	}

}
