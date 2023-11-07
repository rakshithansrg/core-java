class Agent
{
	int id=2;
	String name="Raksha";
	Tent tent;
	
	void openTent(Tent tent)
	{
		System.out.println("SL Name :"+tent.slNo);
		System.out.println("Color :"+tent.color);
		System.out.println("Width :"+tent.width);
		System.out.println("height :"+tent.height);
		tent.open();
	}
	
	void closeTent(Tent tent)
	{
	    System.out.println("SL Name :"+tent.slNo);
		System.out.println("Color :"+tent.color);
		System.out.println("Width :"+tent.width);
		System.out.println("height :"+tent.height);
		tent.close();
	}
	void showInfo()
	{
		System.out.println("ID :"+this.id);
		System.out.println("Name :"+this.name);
		System.out.println("Tent :"+this.tent);
		if(this.tent!=null)
		{
		System.out.println("SL Name :"+this.tent.slNo);
		System.out.println("Color :"+this.tent.color);
		System.out.println("Width :"+this.tent.width);
		System.out.println("height :"+this.tent.height);
		}
	}
}
