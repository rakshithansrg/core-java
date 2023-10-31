class Ornament
{
	String types;
	int noOfTypes;
	String design;
	double priceInGrms;
	
	Ornament()
	{
		
		this("Gold",7,"Parrot",300);
		System.out.println("--------------------------");
	}
	
	Ornament(String types)
	{
		System.out.println("--------------------------");
		System.out.println("Ornament 1");
		this.types=types;
		System.out.println("--------------------------");
	}
	Ornament(String types,int noOfTypes)
	{
		super();
		System.out.println("--------------------------");
		System.out.println("Ornament 2");
		this.types=types;
		this.noOfTypes=noOfTypes;
		System.out.println("--------------------------");
	}
	Ornament(String types,int noOfTypes,String design)
    {
		System.out.println("--------------------------");
		System.out.println("Ornament 3");
		this.types=types;
		this.noOfTypes=noOfTypes;
		this.design=design;
		System.out.println("--------------------------");
	}
	Ornament(String types,int noOfTypes,String design,double priceInGrms)
    {
		System.out.println("--------------------------");
		System.out.println("Ornament 4");
		this.types=types;
		this.noOfTypes=noOfTypes;
		this.design=design;
		this.priceInGrms=priceInGrms;
		System.out.println("--------------------------");
	}
	
}