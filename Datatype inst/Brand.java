class Brand
{
	String name="Sony";
	String origin="India";
	String ceoName="Raksha";
	City[] cities;//5
	
	Brand(City[] cities)
	{
		this.cities=cities;
	}
	
	void show()
	{
		System.out.println("-----Brand-----");
		System.out.println("Name :"+this.name);
		System.out.println("Origin :"+this.origin);
		System.out.println("CEO Name :"+this.ceoName);
		System.out.println("City :"+this.cities);
		if(this.cities!=null)
		{
			for(int seq=0;seq<this.cities.length;seq++)
			{
				City ref=this.cities[seq];
				System.out.println("Cities :"+ref+"------Index :"+seq);
			}
		}

	}
	
}