class Carrom
{
	int noOfPans;
	String colorOfPans;
	String shape;
	int blocks;
	double cost;
	
	Carrom()
	{
		this(27,"White","Square",4,2000);
		System.out.println("Started at Carrom");
	}
	Carrom(int noOfPans)
	{
		this.noOfPans=noOfPans;
		
	}
	Carrom(int noOfPans,String colorOfPans)
	{
		this(noOfPans);
		this.colorOfPans=colorOfPans;
	}
	Carrom(int noOfPans,String colorOfPans,String shape)
	{
		this(noOfPans,colorOfPans);
		this.shape=shape;
	}
	Carrom(int noOfPans,String colorOfPans,String shape,int blocks,double cost)
	{
		this(noOfPans,colorOfPans,shape);
		this.blocks=blocks;
		this.cost=cost;
	}
	
}