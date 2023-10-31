class Clock
{
	String shape;
	int size;
	String brand;
	String color;
	
	Clock()
	{
		super();
		System.out.println("--------------------------");

		System.out.println("Default using super Keyword");
		System.out.println("--------------------------");
	}
	Clock(String shape)
	{
		System.out.println("--------------------------");
		System.out.println("...Clock 1...");
		this.shape=shape;
		System.out.println("--------------------------");
	}
	Clock(String shape,int size)
	{
		System.out.println("--------------------------");
		System.out.println("...Clock 2...");
		this.shape=shape;
		this.size=size;
		System.out.println("--------------------------");
		
	}
    Clock(String shape,int size,String brand)
	{
		System.out.println("--------------------------");
		System.out.println("...Clock 3...");
		this.shape=shape;
		this.size=size;
		this.brand=brand;
		System.out.println("--------------------------");
	}
    Clock(String shape,int size,String brand,String color)
	{
		super();
		System.out.println("--------------------------");
		System.out.println("...Clock 4...");

		this.shape=shape;
		this.size=size;
		this.brand=brand;
		this.color=color;
		System.out.println("--------------------------");
	}

}