class Keyboard
{
	String brand;
	String color;
	int noOfKeys;
	String type;
	double cost;
	
	Keyboard()
	{
		System.out.println("----------------------");
		System.out.println("Keyboard Started 1");
		System.out.println("----------------------");
	}
	
	Keyboard(String brand)
	{
		this.brand=brand;
		System.out.println("----------------------");
		System.out.println("Keyboard Started 2");
		System.out.println("----------------------");
	}
	
	Keyboard(String brand,String color)
	{
		this.brand=brand;
		this.color=color;
		System.out.println("----------------------");
		System.out.println("Keyboard Started 3");
		System.out.println("----------------------");
	}
	Keyboard(String brand,String color,int noOfKeys)
	{
		this.brand=brand;
		this.color=color;
		this.noOfKeys=noOfKeys;
		System.out.println("----------------------");
		System.out.println("Keyboard Started 4");
		System.out.println("----------------------");
	}
	Keyboard(String brand,String color,int noOfKeys,String type)
	{
		this.brand=brand;
		this.color=color;
		this.noOfKeys=noOfKeys;
		this.type=type;
		System.out.println("----------------------");
		System.out.println("Keyboard Started 5");
		System.out.println("----------------------");
	}
	Keyboard(String brand,String color,int noOfKeys,String type,double cost)
	{
		
		this.brand=brand;
		this.color=color;
		this.noOfKeys=noOfKeys;
		this.type=type;
		this.cost=cost;
		System.out.println("----------------------");
		System.out.println("Keyboard Started 6");
		System.out.println("----------------------");
	}
}