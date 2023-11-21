class LaminatedGlass extends Glass
{
	Double cost=1000d;
	int warranty;
	
	LaminatedGlass()
	{
		System.out.println("no arg const in LaminatedGlass");
	}
	
	LaminatedGlass(int length,String thickness, String usage,String brand,int warranty)
	{
		this.length=length;
		this.thickness=thickness;
		this.usage=usage;
		this.brand=brand;
		this.warranty=warranty;
	}
}