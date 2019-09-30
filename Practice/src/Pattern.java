import java.util.Scanner;

public class Pattern {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int Number_of_stars= sc.nextInt();
		
	
		while(Number_of_stars>0)
		{
			for(int column=Number_of_stars;column>0;column--)
			{
				System.out.print("* ");
			}
			Number_of_stars--;
			System.out.println(" ");
		}
		sc.close();
	}

}
