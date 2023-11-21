class Glass
{
	int length;
	String thickness;
	GlassType type=GlassType.LAMINATED;
	String usage;
	String brand;
	
	Glass()
	{
		System.out.println("no arg const in Glass");
	}
	
	Glass(int length,String thickness,String usage,String brand)
	{
		this.length=length;
		this.thickness=thickness;
		this.usage=usage;
		this.brand=brand;
	}
}