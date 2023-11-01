class Printer
{
	String model;
	double capacity;
	int cost;
	String brand;
	int noOfPages;
	
	Printer()
	{
		this("ASD",233,12000,"SDF",120);
		System.out.println("Starting at Printer");
	}
	Printer(String model)
	{
		this.model=model;
		System.out.println("=====================================");
		System.out.println("String :"+model);
		
	}
	Printer(String model,double capacity)
	{
		this(model);
		this.capacity=capacity;
		System.out.println("=====================================");
		System.out.println("String and double :"+model+","+capacity);
		
	}
	
	Printer(String model,double capacity,int cost)
	{
		this(model,capacity);
		this.cost=cost;
		System.out.println("=====================================");
		System.out.println("String ,double,int:"+model+","+capacity+","+cost);
		
	}
	Printer(String model,double capacity,int cost,String brand)
	{
		this(model,capacity,cost);
		this.brand=brand;
		System.out.println("======================================");
		System.out.println("String,double,int,double :"+model+","+capacity+","+cost+","+brand);
		
	}
	Printer(String model,double capacity,int cost,String brand,int noOfPages)
	{
		this(model,capacity,cost,brand);
		this.noOfPages=noOfPages;
		System.out.println("======================================");
		System.out.println("String,double,int,double,int :"+model+","+capacity+","+cost+","+brand+","+noOfPages);
		System.out.println("======================================");
	}
	
}