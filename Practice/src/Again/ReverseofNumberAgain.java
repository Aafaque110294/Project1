package Again;

public class ReverseofNuberAgain {

	public static void main(String[] args) 
	{
		int number= 1234567890;
		int remainder,sum=0;
		
		while(number>0)
		{
			remainder=number%10;
			sum= remainder+(sum*10);
			number=number/10;
		}
		
		System.out.println("Reverse of a number is"+sum);
	}

}
