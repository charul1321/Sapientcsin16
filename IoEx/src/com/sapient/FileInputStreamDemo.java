package com.sapient;

import java.io.*;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException
	{
		int size;
		InputStream f = new FileInputStream("FileInputStreamDemo.java");
		
		
		
			System.out.println("total available bytes: "+ (size=f.available()));
		
				int n=size/40;
				System.out.println("first"+n+"bytes of the file one read() at atime");
				for(int i=0;i<n;i++)
				{
					System.out.println(f.read());
					
				}
				System.out.println("\nstill available: "+ f.available());
				System.out.println("reading the next "+n+"with one read(b[])");
			byte b[]=new byte[n];
				if(f.read(b)!=n)
				{ 
					System.err.println("\n couldn't read "+n+"bytes" );
					
					}
				System.out.println(new String(b,0,n));
				System.out.println("\n still available: "+(size=f.available()));
				f.skip(size/2);
				
				f.close()
				
	}
	
}
