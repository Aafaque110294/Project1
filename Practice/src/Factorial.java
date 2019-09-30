import java.util.Scanner;

public class Factorial
{
	public static void main(String args[])
	{		
		Scanner sc= new Scanner(System.in);
		int Factorial_number= sc.nextInt();
		System.out.println(factorial(Factorial_number));
		sc.close();
	}
	
	static int factorial(int n)
	{
		if(n==0)
			return 1;
		else
			return n*factorial(n-1);
	}
}
