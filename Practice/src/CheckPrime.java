
public class CheckPrime {

	public static void main(String[] args)
	{
		int number=19;
		boolean isprime= true;
		
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
				isprime=false;			
		}
		
		if(isprime)
			System.out.println(number+" is prime number");
		else
			System.out.println(number+" is not prime number");
	}

}
// prime numbers : 2 3 5 7 11 13 17 19 