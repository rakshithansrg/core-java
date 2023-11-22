//10 pro 11 method
class Food
{
	String name;
	String types;
	int noOfItems;
	double quantity;
	double quality; 
	double cost;
	String variety;
	boolean hygin;
	String sweet;
	String snacks;
	
	Food()
	{
		System.out.println("no arg const in Food");
	}
	
	Food(String name,String types,int noOfItems,double quantity,double quality,double cost,String variety,boolean hygin,String sweet,String snacks)
	{
		this.name=name;
		this.types=types;
		this.noOfItems=noOfItems;
		this.quantity=quantity;
		this.quality=quality;
		this.cost=cost;
		this.variety=variety;
		this.hygin=hygin;
		this.sweet=sweet;
		this.snacks=snacks;
	}
	
	void eat()
	{
		System.out.println("Running eat in Food");
	}
	
	
	void drink()
	{
		System.out.println("Running drink in Food");
	}
	
	
	void parcel()
	{
		System.out.println("Running parcel in Food");
	}
	
	void supply()
	{
		System.out.println("Running supply in Food");
	}
	
	void energy()
	{
		System.out.println("Running energy in Food");
	}
	
	void give()
	{
		System.out.println("Running give in Food");
	}
	
	void recive()
	{
		System.out.println("Running recive in Food");
	}
	
	void buy()
	{
		System.out.println("Running buy in Food");
	}
	
	void parcel1()
	{
		System.out.println("Running parcel in Food");
	}
	
	void waste()
	{
		System.out.println("Running waste in Food");
	}
	
	void sell()
	{
		System.out.println("Running parcel in Food");
	}
	
	
}