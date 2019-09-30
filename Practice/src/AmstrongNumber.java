import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) 
	{
		int number,value, sum=0;
		Scanner sc= new Scanner(System.in);
		number=sc.nextInt();
		value=number;
		
		
		while(number>0)
		{
			int num=number%10;
			sum=sum + (num*num*num);
			number=number/10;
		}
		
		System.out.println("Sum of Cube of each number is ="+ sum);
		
		if(sum==value)
			System.out.println("It is an amstrong number");
		else
			System.out.println("It is not an amstrong number");
		
		sc.close();
	}

}
