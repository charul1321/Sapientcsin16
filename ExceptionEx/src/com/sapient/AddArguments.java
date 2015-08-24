package com.sapient;

public class AddArguments {
	public static void main(String[] args)
	{  try
	{
		int sum=0;
		for(String arg:args)
		{
			sum+=Integer.parseInt(arg);
		}
		System.out.println("sum="+sum);
	}
	catch(NumberFormatException nfe)
	{ System.err.println("one of the command-line arguments is not integer ");
		}
	}

}
