package mainpack;

public class CopyArray {
 public static void main(String[] args)
 {
	 int[] arr1, arr2;
	 arr1=new int[5];
	 arr2=new int[7];
	 for(int i=0;i<arr1.length;i++)
	 {
		 arr1[i]=i;
	 }
	 System.arraycopy(arr1, 0, arr2, 0, 5);
	 for(int j=0;j<arr2.length;j++)
	 {
		 System.out.println(arr2[j]);
	 }
		 }
}