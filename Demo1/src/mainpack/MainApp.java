package mainpack;

class Process
{ public int[] create()
  {
	 int[] num;
	num=new int[10];
	  num[4]=4;
	  num[5]=5;
	  return num;
}
  public void display(int [] num)
  { for (int data:num)
     {
	  System.out.println(data);
      }
  }
}
public class MainApp {
	public static void main(String[] args)
 {
	  int[][][] arr;
	  arr= new int[3][3][2];
	  arr[1][2][1]=1;
 for (int[][] dim1:arr)
	 {
	 for(int[] dim2:dim1)
	 {
		 for(int dim3:dim2)
	 { System.out.println(dim3);
	 }
	 }
	 }
}
}
	   
	   
        

 