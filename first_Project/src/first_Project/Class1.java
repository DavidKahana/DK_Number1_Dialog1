package first_Project;
import java.util.Scanner;
public class Class1 //כותרת המחלקה class1    
{// start class1
	public static Scanner in = new Scanner (System.in);//בניית סורק לקלט 
	public static void main(String[]args)//כותרת פעולה ראשית main
	{//start main
		String name;
		System.out.println("");//פקודת פלט
		System.out.println(" whats your name?");
		name = in.next();
		System.out.println("hallo"+ name);
	}
}
