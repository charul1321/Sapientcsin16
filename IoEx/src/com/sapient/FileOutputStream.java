package com.sapient;
import java.io.*;
public class FileOutputStream {
	public static void main(String[] args) throws IOException
	{
		
	}String source="now is the time forall good men\n"
			+"to come to the aid of their country\n"
			+"and pay their due taxes.";
	byte buff[]=source.getBytes();
	OutputStream fo=new FileOutputStream("file1.txt");
	for(int i=0;i<buf.length;i+=2)
	{
		fo.write(buf[i]);
		
	}
	fo.close();
	System.out.println
	
}
