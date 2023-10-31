class MakeupKit
{
	int noOfItems;
	double cost;
	String brand;
	double ratings;
	
	MakeupKit()
	{
		super();
		System.out.println("--------------------------");
		System.out.println("MakeUp");
		System.out.println("Default using super Keyword");
		System.out.println("--------------------------");
		
	}
	MakeupKit(int noOfItems)
	{
		System.out.println("--------------------------");
		System.out.println("MakeUp 1");
		this.noOfItems=noOfItems;
		System.out.println("--------------------------");
		
	}
	MakeupKit(int noOfItems,double cost)
	{   
	    System.out.println("--------------------------");
		System.out.println("MakeUp 2");
		this.noOfItems=noOfItems;
		this.cost=cost;
		System.out.println("--------------------------");
	}
	MakeupKit(int noOfItems,double cost,String brand)
	{
		super();
		System.out.println("--------------------------");
		System.out.println("MakeUp 3");
		this.noOfItems=noOfItems;
		this.cost=cost;
		this.brand=brand;
		System.out.println("--------------------------");
	}
	MakeupKit(int noOfItems,double cost,String brand,double ratings)
	{
		super();
		System.out.println("--------------------------");
		System.out.println("MakeUp 4");
		this.noOfItems=noOfItems;
		this.cost=cost;
		this.brand=brand;
		this.ratings=ratings;
		System.out.println("--------------------------");
	}
	
}