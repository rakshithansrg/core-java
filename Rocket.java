class Rocket
{
	long speed;
	String engine;
	String name;
	int length;
	
	Rocket()
	{
		super();
		System.out.println("--------------------------");

		System.out.println("Default using super Keyword");
	    System.out.println("--------------------------");

	}
	Rocket(long speed)
	{    
	    System.out.println("--------------------------");
		System.out.println("Rocket 1");
		this.speed=speed;
		System.out.println("--------------------------");
	}
	Rocket(long speed,String engine)
	{
		System.out.println("--------------------------");
		System.out.println("Rocket 2");
		this.speed=speed;
		this.engine=engine;
		System.out.println("--------------------------");
	}
	Rocket(long speed,String engine,String name)
	{
		super();
		System.out.println("--------------------------");
		System.out.println("Rocket 3");
		this.speed=speed;
		this.engine=engine;
		this.name=name;
		System.out.println("--------------------------");
	}
	Rocket(long speed,String engine,String name,int length)
	{
		super();
		System.out.println("--------------------------");
		System.out.println("Rocket 4");
		this.speed=speed;
		this.engine=engine;
		this.name=name;
		this.length=length;
		System.out.println("--------------------------");
	}
}