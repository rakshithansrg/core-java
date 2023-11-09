class Brand
{
	String name="Sony";
	String origin="India";
	String ceoName="Raksha";
	String[] cities;//5
	
	void setCities(String[] cities)
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
				String ref=this.cities[seq];
				System.out.println("Cities :"+ref+"------Index :"+seq);
			}
		}

	}
	
}