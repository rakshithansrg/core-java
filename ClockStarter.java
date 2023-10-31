class ClockStarter
{
	public static void main(String[] args)
	{
		Clock clock=new Clock();
		{
			System.out.println("Shape :"+clock.shape);
			System.out.println("Size :"+clock.size);
			System.out.println("Brand :"+clock.brand);
			System.out.println("Color :"+clock.color);
		}
		Clock clock1=new Clock("Circle");
		{
			System.out.println("Shape :"+clock1.shape);
			System.out.println("Size :"+clock1.size);
			System.out.println("Brand :"+clock1.brand);
			System.out.println("Color :"+clock1.color);
		}
		Clock clock2=new Clock("Circle",12);
		{
			System.out.println("Shape :"+clock2.shape);
			System.out.println("Size :"+clock2.size);
			System.out.println("Brand :"+clock2.brand);
			System.out.println("Color :"+clock2.color);
		}
		Clock clock3=new Clock("Circle",12,"Rak");
		{
			System.out.println("Shape :"+clock3.shape);
			System.out.println("Size :"+clock3.size);
			System.out.println("Brand :"+clock3.brand);
			System.out.println("Color :"+clock3.color);
		}
		Clock clock4=new Clock("Circle",12,"Rak","White");
		{
			System.out.println("Shape :"+clock4.shape);
			System.out.println("Size :"+clock4.size);
			System.out.println("Brand :"+clock4.brand);
			System.out.println("Color :"+clock4.color);
		}
	}
}