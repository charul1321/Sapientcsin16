package com.sapient;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainApp {
public static void main(String[] args) throws IOException
{
	try(FileInputStream in=new FileInputStream("D:/WORKSPACE/Sapientcsin16/IoEx/sapin.txt");
			FileOutputStream out=new FileOutputStream("D:/WORKSPACE/Sapientcsin16/IoEx/sapout.txt");
			)
			{	int c;
			while((c=in.read())!=-1)
					{
				out.write(c);
					}
}
}
}