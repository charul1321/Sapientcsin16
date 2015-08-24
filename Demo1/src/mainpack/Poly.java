package mainpack;

class Employee {
	public void salary() {
		System.out.println(" employee salary");
	}

}
class Statistics
{ 
	public void sum(int...num)
	{
	int sum=0;
     for(int x:num)
         { sum+=x; 
           }

	 System.out.println(sum); 

	}
	}

class Confirmed extends Employee {
	public void salary() {
		System.out.println(" confirmed salary");
	}
    public void transport()
    {
    	System.out.println("confirmed transport");    }
}

class Intern extends Employee {
	public void salary() {
		System.out.println(" intern salary");
	}

}
class Finance
{ public void processSalary(Employee emp)
{emp.salary();
	}
	}

class Hr {
	public Employee recruit(String empType) {
		if (empType.equals("i")) {
			return new Intern();
		} else if (empType.equals("c")) {
			return new Confirmed();
		}
		return null;
	}
}

public class Poly {
	public static void main(String[] args) {
		Hr hr = new Hr();
		Employee emp;
		Finance fin=new Finance();
		
		emp = hr.recruit("c");
		if (emp != null)
			fin.processSalary(emp);
		if(emp instanceof Confirmed)
		{
			Confirmed conf=(Confirmed)emp;
			((Confirmed) emp).transport();
		}  
   Statistics stat=new Statistics();
    stat.sum(1,2,3,4,5);
    int arr[][]=new int[2][];
      arr[0]=new int[2];
      arr[1]=new int[3];
      arr[2]=new int[4];
       arr[1][3]
	}
}
