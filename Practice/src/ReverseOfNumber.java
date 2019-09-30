import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
