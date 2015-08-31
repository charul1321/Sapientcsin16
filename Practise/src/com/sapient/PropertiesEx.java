package com.sapient;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx {
	public static void main(String[] args)
	{
		Properties prop= System.getProperties();
		Enumeration keys=prop.keys();
		String key;
		while(keys.hasMoreElements())
		{
			key=(String)keys.nextElement();
			System.err.println(key+" : "+ prop.get(key));
		}
		
	}

}
