class HelmetUnique
{
	public static void main(String[] args)
	{
		Helmet helmet=new Helmet();
		{
		    System.out.println("======================");
			System.out.println("Brand :"+helmet.brand);
			System.out.println("Type :"+helmet.type);
			System.out.println("Cost :"+helmet.cost);
			System.out.println("Size :"+helmet.size);
			System.out.println("Color :"+helmet.color);
			System.out.println("======================");
		}
		Helmet helmet1=new Helmet("Raksh");
		{
			System.out.println("Brand :"+helmet1.brand);
			System.out.println("Type :"+helmet1.type);
			System.out.println("Cost :"+helmet1.cost);
			System.out.println("Size :"+helmet1.size);
			System.out.println("Color :"+helmet1.color);
			System.out.println("======================");
		}
		Helmet helmet2=new Helmet("Raksh","ERD");
		{
			System.out.println("Brand :"+helmet2.brand);
			System.out.println("Type :"+helmet2.type);
			System.out.println("Cost :"+helmet2.cost);
			System.out.println("Size :"+helmet2.size);
			System.out.println("Color :"+helmet2.color);
			System.out.println("======================");
		}
		Helmet helmet3=new Helmet("Raksh","ERD",1200);
		{
			System.out.println("Brand :"+helmet3.brand);
			System.out.println("Type :"+helmet3.type);
			System.out.println("Cost :"+helmet3.cost);
			System.out.println("Size :"+helmet3.size);
			System.out.println("Color :"+helmet3.color);
			System.out.println("======================");
		}
		Helmet helmet4=new Helmet("Raksh","ERD",1200,12,"Red");
		{
			System.out.println("Brand :"+helmet4.brand);
			System.out.println("Type :"+helmet4.type);
			System.out.println("Cost :"+helmet4.cost);
			System.out.println("Size :"+helmet4.size);
			System.out.println("Color :"+helmet4.color);
			System.out.println("======================");
		}
	
	}

}