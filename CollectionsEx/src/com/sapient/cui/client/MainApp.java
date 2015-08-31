package com.sapient.cui.client;

import java.util.*;

class Data
{
	private int value;
	Data(int value)
	{
		this.value=value;
	}
	public int getValue()
	{
		return value;
	}
	public String toString()
	{
		return String.valueOf(value);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return value;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Data)
		{   Data d=(Data)obj;
			if(value==d.value)
			{
				return true;
			}
		}
		return false;
	}
	
	
	
	}

public class MainApp {
	public static void main(String[] args)
	{   Data data;
		Set<Data> set=new HashSet<Data>();
		set.add(new Data(4));
		set.add(new Data(2));
		set.add(new Data(4));
		set.add(new Data(6));
		set.add(new Data(5));
		Iterator<Data> iterator=set.iterator();
		while(iterator.hasNext())
		{
			data=iterator.next();
			System.out.println(data);
		}

		
	}

}
