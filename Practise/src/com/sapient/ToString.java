package com.sapient;
class MyDate
{  int day;
int month;
int year;
	MyDate(int day,int month,int year)
	{ this.day=day;
	this.month=month;
	this.year=year;
		}
	public MyDate addDays(int day)
	{
		int new_day=0;
		new_day=this.day+day;
		MyDate new_date=new MyDate(new_day,month,year);
		return new_date;
		
	}
	public String toString(){
	 return day + "-" + month + "-" + year;
	}
}
public class ToString{
public static void main(String[] args)
{  MyDate my_birth= new MyDate(22,7,1964);
   MyDate next_week=my_birth.addDays(7);
   System.out.println(my_birth);
   System.out.println(next_week);
	}
}