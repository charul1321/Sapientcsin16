package com.sapient;

import java.io.*;

import java.io.FileOutputStream;

public class DataIODemo {
	public static void main(String[] args) throws IOException
	{
		OutputStream fout=new FileOutputStream("test.dat");
		DataOutputStream out=new DataOutputStream(fout);
		out.writeDouble(98.6);
		out.write(1000);
		out.writeBoolean(true);
		out.close();
		InputStream fin=new FileInputStream("test.dat");
		DataInputStream in=new DataInputStream(fin);
		double d=in.readDouble();
		int i=in.read();
		boolean b=in.readBoolean();
		System.out.println("here are the values: "+d+" "+i+" "+b);
		in.close();
	}

}
