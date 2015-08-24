package com.sapient;

class IllegalAgeException extends Exception
{ public String  getMessage()
{  return "you should be 18 or above ";
	}
	}

class Vote
{ public void register(int age) throws IllegalAgeException
    {
	if(age<18)
	{
		throw new IllegalAgeException();
	}
	  System.out.println("yor are eligible to register gor vote");
	}
	}

public class MainApp {
	public static void main(String[] args)
	{ Vote vote=new Vote();
		try
		{
			vote.register(16);
		}
		catch(IllegalAgeException iae)
		
		{
		System.out.println(iae.getMessage());
		}
	}

}
