public class Mission_1 { // q3

	public static void main(String[] args) {
		
	int n = 10;
	System.out.println(numDouble(n));
		

	}
	
	public static int numDouble (int n){
		if (n == 1) {
			return 0;
		}
		if (n % 2 == 0) {
			return 1 + numDouble(n - 1);
		}
		else {
			return 0 + numDouble(n - 1);
		}
		
	}

}
