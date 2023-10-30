class MatchBox
{
	String brand;
	int noOfStick;
	double length;
	double price;
	String size;
	int weight;
	String type;
	
	MatchBox()
	{
		System.out.println("----------------------");
		System.out.println("Matchbox Started");
		System.out.println("----------------------");
		
	}
	MatchBox(String brand)
	{
		this.brand=brand;
		System.out.println("----------------------");
		System.out.println("Matchbox Started 1");
		System.out.println("----------------------");
	}
	MatchBox(String brand,int noOfStick)
	{
		this.brand=brand;
		this.noOfStick=noOfStick;
		System.out.println("----------------------");
		System.out.println("Matchbox Started 2");
		System.out.println("----------------------");
	}
	MatchBox(String brand,int noOfStick,double length)
	{
		this.brand=brand;
		this.noOfStick=noOfStick;
		this.length=length;
		System.out.println("Matchbox Started 3");
	}
	MatchBox(String brand,int noOfStick,double length,double price)
	{
		this.brand=brand;
		this.noOfStick=noOfStick;
		this.length=length;
		this.price=price;
		System.out.println("----------------------");
		System.out.println("Matchbox Started 4");
		System.out.println("----------------------");
	}
	MatchBox(String brand,int noOfStick,double length,double price,String size)
	{
		this.brand=brand;
		this.noOfStick=noOfStick;
		this.length=length;
		this.price=price;
		this.size=size;
		System.out.println("----------------------");
		System.out.println("Matchbox Started 5");
		System.out.println("----------------------");
	}
	MatchBox(String brand,int noOfStick,double length,double price,String size,int weight)
	{
		this.brand=brand;
		this.noOfStick=noOfStick;
		this.length=length;
		this.price=price;
		this.size=size;
		this.weight=weight;
		System.out.println("----------------------");
		System.out.println("Matchbox Started 6");
		System.out.println("----------------------");
	}
	MatchBox(String brand,int noOfStick,double length,double price,String size,int weight,String type)
	{
		this.brand=brand;
		this.noOfStick=noOfStick;
		this.length=length;
		this.price=price;
		this.size=size;
		this.weight=weight;
		this.type=type;
		System.out.println("----------------------");
		System.out.println("Matchbox Started 7");
		System.out.println("----------------------");
	}
	
	
}