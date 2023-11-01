class Helmet
{
	String brand;
	String type;
	double cost;
	int size;
	String color;
	
	Helmet()
	{
		this("ASD","WER",1234,12,"White");
		System.out.println("Starting Helment");
	}
	Helmet(String brand)
	{
		this.brand=brand;
	}
	Helmet(String brand,String type)
	{
		this(brand);
		this.type=type;
	}
	Helmet(String brand,String type,double cost)
	{
		this(brand,type);
		this.cost=cost;
	}
	Helmet(String brand,String type,double cost,int size)
	{
		this(brand,type,cost);
		this.size=size;
	}
	Helmet(String brand,String type,double cost,int size,String color)
	{
		this(brand,type,cost,size);
		this.color=color;
	}
	
}