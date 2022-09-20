
public class Mission_5 { //Q8

	public static void main(String[] args) {
		
		int num = 15323;
		
		System.out.println(sumOfDigits(num));

	}
	
	public static int sumOfDigits(int num) {
		if (num < 10) {
			return num;
		}
		return (num % 10) + sumOfDigits(num / 10);
	}

}
