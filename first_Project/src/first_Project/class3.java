package first_Project;
import java.util.Scanner;
public class class3 
{     
	public static void main(String[]args)
	{
		Scanner in = new Scanner (System.in);
		String name;
		int ageNum;
		Double weight;
		char firstletter;
		Boolean mood;
		System.out.println("whats your name?");
		name = in.next();
		System.out.println("hallo "+ name);
		System.out.println("what is your age ");
		ageNum = in.nextInt();
		System.out.println("how much do you weight?");
		weight = in.nextDouble();
		System.out.println("what is your first latter?");
        firstletter = in.next().charAt(0);
		System.out.println("are you happy? (true / false)");
		mood = in.nextBoolean();
	System.out.println("hi "+ name + "your age is"+ ageNum +" your weight is"+ weight +" your first letter is"+ firstletter);
	}
}   