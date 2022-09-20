
public class Mission_4 { // Q7

	public static void main(String[] args) {
		
		int num = 34512;
		
		System.out.println(numOfDigits(num));
		

	}
	
	public static int numOfDigits(int num) {
		if (num < 10) {
			return 1;
		}
		return 1 + numOfDigits(num / 10);
	}

}
