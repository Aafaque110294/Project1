public class CountPrime {
	

	public static void main(String[] args)
	{
		int Till_Number= 20;
		
		System.out.println("All Prime number Till end= "+ Till_Number);
		PrintPrime(Till_Number);
		
	}
	
	static void PrintPrime(int Till_Number)
	{
		for(int i=2;i<=Till_Number;i++)
		{
			if (IsPrime(i))
				System.out.println(i+" ");
		}

	}
	
	static boolean IsPrime(int i)
	{
		for(int j=2;j<i;j++)
			if(i%j==0)
				return false;
						
			return true;
	}

}
