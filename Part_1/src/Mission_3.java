
public class Mission_3 { // Q5

	public static void main(String[] args) {
		
		int a = 100;
		int b = 7;
		
		System.out.println(remainderAToB(a, b));

	}
	
	public static int remainderAToB(int a , int b){
		if (a == b ) {
				return 0;
		}
		if (a - b >= b) {
			return 0 + remainderAToB(a - b, b);
		}
		else{
		return 1 + remainderAToB(a - 1, b);
		}
	}
}
