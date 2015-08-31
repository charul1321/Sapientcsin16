package com.sapient;

import java.io.File;

public class FileDemo {
  static void p(String s)
  {
	  System.out.println(s);
  }
  public static void main(String[] args)
  {
	 File f1=new File("D;/sapient");
	 p("file name: " + f1.getName());
	  p("path: " + f1.getPath());
	  p("abs path: "+ f1.getAbsolutePath());
	  p("parent: "+ f1.getParent());
	  p(f1.exists()? "exists" : "does not exists");
	  p(f1.canWrite()?"is writtable" : "not writable");
	  p(f1.canRead()?"is readable" : "not readable");
	  p("is" + (f1.isDirectory()? " ": "not")+ "a directory");
	  p(f1.isAbsolute()? "is absolute":"might be anamed pipe");
	  p("file last modified: "+ f1.lastModified());
	  p("file size:" + f1.length() +"bytes");
  }
}
