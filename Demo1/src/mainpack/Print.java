package mainpack;

 class Point {
	int x;
	int y;
	Point(int i,int j)
	{ x=i;
	y=j;
	}
}
class Create
{
	public Point[] createArray()
	{ 
		Point[] p;
		p=new Point[5];
	  for (int i=0; i<p.length; i++)
	  { p[i]=new Point(i,i+1);
		  
		}
	  return p;
	}
}
	 public class Print
	{
public static void main(String [] args)
{
  Create c= new Create();
  Point[] pt;
  pt=c.createArray();
  for(Point p:pt)
  {
  System.out.println(p.x);
  System.out.println(p.y);
  }
}
	}
