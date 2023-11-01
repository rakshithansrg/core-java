class Bracelet
{
	String design;
	double weight;
	String metal;
	double cost;
	String size;
	
	Bracelet()
	{
		this("Parrot",123,"Silver",30000,"Small");
		System.out.println("Started in Bracelet");
	}
	Bracelet(String design)
	{
		this.design=design;
	}
	Bracelet(String design,double weight)
	{
		this(design);
		this.weight=weight;
	}
	Bracelet(String design,double weight,String metal)
	{
		this(design,weight);
		this.metal=metal;
	}
	Bracelet(String design,double weight,String metal,double cost,String size)
	{
		this(design,weight,metal);
		this.cost=cost;
		this.size=size;
	}
	
}