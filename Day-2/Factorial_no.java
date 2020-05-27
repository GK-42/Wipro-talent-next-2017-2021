package factorial_no;
import java.util.Scanner;

public class Factorial_no {
	public static void main(String[] args)
	{
		int i, fact=1, n;
		System.out.println("Enter the no to find the factorial: ");
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("The factorial of "+ n + " is: "+fact);
	}
	

}
