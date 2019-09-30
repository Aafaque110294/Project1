
public class Splitwords {

	public static void main(String[] args)
	{
		String string="ABCde123";
		String caps="",lower="",number="";
		int len=string.length();
		char ch;

			for(int k=0;k<len;k++)
				{
					ch=string.charAt(k);
					if(Character.isUpperCase(ch))
					{
						//System.out.print(ch);
						caps=caps+ch;
					}
					
					if(Character.isLowerCase(ch))
					{
						lower=lower+ch;
					}
					
					if(Character.isDigit(ch))
					{
						number=number+ch;
						//System.out.print(ch);
					}
				}
			System.out.println("Capital letters--> "+ caps);
			System.out.println("small letters--> "+ lower);
			System.out.println("numbers--> "+ number);
			
	}

}
