
public class Mission_2 {//Q4

	public static void main(String[] args) {
		
		int a = 124;
		int b = 10;
		
		System.out.println(portionAToB(a, b));

	}
	
	public static int portionAToB(int a , int b){
		if (a < b) {
			return 0;
		}
		return 1 + portionAToB(a - b, b);
	}

}
