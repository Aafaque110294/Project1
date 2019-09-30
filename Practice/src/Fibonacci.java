import java.util.Scanner;

public class Fibonacci {
//                 0,1,1,2,3,5,8,13,21
	public static void main(String[] args)
	{
		int initial=1, n, now = 0 ;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		//init=1, now=0, a=1
		//init=0, now=1, a=1
		//init=1, now=1, a=2
		//init=1, now=2, a=3
		System.out.print("Fibonnaci series till n number is: 0");
		for(int i=1;i<n;i++)
		{
			int a=initial+now;
			initial=now;
			now=a;
			System.out.print(","+now);
		}
		
		sc.close();
	}

}
