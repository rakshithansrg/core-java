class Laptop
{
	Hardware[] hardware;//10
	Owner owner;
	Brand brand;
	
	Laptop(Hardware[] hardware,Owner owner,Brand brand)
	{
		this.hardware=hardware;
		this.owner=owner;
		this.brand=brand;
	}
	
	void show()
	{
		
		System.out.println("-----Laptop------");
		System.out.println("Hardware :"+this.hardware);
		if(this.hardware!=null)
		{
			for(int j=0;j<this.hardware.length;j++)
			{
				Hardware seq=this.hardware[j];
				
				System.out.println("Hardware :"+seq+"Index :"+j);
				seq.show();
				
			}
			
		}
		System.out.println("Owner :"+this.owner);
		if(this.owner!=null)
		{
			this.owner.show();
		}
		System.out.println("Brand :"+this.brand);
		if(this.brand!=null)
		{
			this.brand.show();
		}
		
	}
}