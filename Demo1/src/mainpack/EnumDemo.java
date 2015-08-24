package mainpack;
enum Apple
{ Jonathan(10), GoldenDel(12), RedDel(15), Winesap(11);
 private int price;
Apple(int p)
{ price=p;
	}
public int getPrice()
{ return price;
	}
}


 public class EnumDemo {
	public static void main(String[] args)
	{ 
		System.out.println("price for winesap "+ Apple.Winesap.getPrice());
	for(Apple ap:Apple.values())
	{
		System.out.println(ap.getPrice());
	}
		
	}
	

}
