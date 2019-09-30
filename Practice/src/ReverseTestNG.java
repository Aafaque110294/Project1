import java.util.Scanner;

import org.testng.annotations.*;
@Test
public class ReverseTestNG {

		public void test()
	{
		int number, sum=0, remainder;
		Scanner scan= new Scanner(System.in);
		number=scan.nextInt();
		
		while (number>0)
		{
			remainder= number%10;
			sum=remainder+(sum*10);
			number=number/10;
			
		}
		System.out.println("Reverse is "+sum);
		scan.close();
	}
}

