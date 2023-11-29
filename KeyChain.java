class KeyChain
{
	String design;
	double cost;
	int noOfKeys;
	String type;
	String usedTO;
	
	KeyChain()
	{
		this("Star",200,4,"wood","openLock");
		System.out.println("Started in KeyChain");
	}
	KeyChain(String design)
	{
		this.design=design;
	}
	KeyChain(String design,double cost)
	{
		this(design);
		this.cost=cost;
	}
	KeyChain(String design,double cost,int noOfKeys)
	{
		this(design,cost);
		this.noOfKeys=noOfKeys;
	}
	KeyChain(String design, double cost,int noOfKeys,String type)
	{
		this(design,cost,noOfKeys);
		this.type=type;
	}
	KeyChain(String design,double cost,int noOfKeys,String type,String usedTO)
	{
		this(design,cost,noOfKeys,type);
		this.usedTO=usedTO;
	}
	
}
