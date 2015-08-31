package com.sapient;

class Data
{
	private int firstNumber;
	private int secondNumber;
	public void setFirstNumber(int firstNumber)
	{
		this.firstNumber=firstNumber;
	}
	public int getFirstNumber()
	{
		return firstNumber;
	}
	public void setSecondNumber(int secondNumber)
	{
		this.secondNumber=secondNumber;
	}
	public int getSecondNumber()
	{
		return secondNumber;
	}
	public boolean equals(Object obj){
		if(obj==null)
		{return false;}
		if(obj instanceof Data)
		{
		Data d=(Data)obj;
		
		if(firstNumber==d.getFirstNumber() && secondNumber==d.getSecondNumber())
		{
			return true;
		}
		else {return false;}
	}
		else {return false;}
	}
}
public class EqualsEx {
	public static void main(String[] args)
	{
		Data d1=new Data();
		Data d2=new Data();
		d1.setFirstNumber(23);
		d1.setSecondNumber(43);
		d2.setFirstNumber(23);
		d2.setSecondNumber(43);
		System.out.println(d1.equals(d2));
		
	}
	

}
