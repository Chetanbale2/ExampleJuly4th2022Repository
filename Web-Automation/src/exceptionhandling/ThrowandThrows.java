package exceptionhandling;

class Stringtest
{
    static int getcharcount(String s) throws Exception
    {
    	if(s==null) 
    	{
    		throw new Exception("The input string is null,plz enter valid string ");
    	}
    	
    	return s.length();
    }	

}


public class ThrowandThrows {

	public static void main(String[] args) {
		try 
		{
			int n1=Stringtest.getcharcount("java");
			System.out.println("no of chars :" +n1);
			int n2=Stringtest.getcharcount(null);
			System.out.println("no of chars :" +n2);
			
			
		}catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}

	}

}
