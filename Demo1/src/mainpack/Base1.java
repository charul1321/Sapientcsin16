package mainpack;

public class Base1
{
	private int i=1;
	 public void firstMethod()
	 {
		 int i=4,j=7;
		 this.i=i+j;
		 secondMethod(this.i);
	 }
		 public void secondMethod(int i)
		 {
			 int j=8;
			 this.i=i+j;
		 }
	 public static void main(String[] args)
	 {
		 Base1 b1=new Base1();
		 b1.firstMethod();
		 System.out.print(b1.i);
	 }
	 
	 
	 
}