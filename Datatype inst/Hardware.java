class Hardware
{
	String name;
	String type;
	Brand brand;
	
	Hardware(String name,String type,Brand brand)
	{
		this.name=name;
		this.type=type;
		this.brand=brand;
	}
	
	void show()
	{
		System.out.println("------Hardware--------");
		System.out.println("Name :"+this.name);
		System.out.println("Type :"+this.type);
		System.out.println("Brand :"+this.brand);
		if(null!=null)
		{
			this.brand.show();
		}
		
	}
	
	
}