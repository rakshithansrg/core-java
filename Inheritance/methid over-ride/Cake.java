//2 pro 4 method override 4 methods
class Cake extends Food
{
	String color;
	String flavor;
	Cake()
	{
		System.out.println("no arg const in Cake");
	}
	
	Cake(String name,String types,int noOfItems,double quantity,double quality,double cost,String variety,boolean hygin,String sweet,String snacks,String color,String flavor)
	{
		super(name,types,noOfItems,quantity,quality,cost,variety,hygin,sweet,snacks);
		this.color=color;
		this.flavor=flavor;
	}
	
	
	void toEat()
	{
		System.out.println("Running toEat in Food");
	}
	
	void taste()
	{
		System.out.println("Running taste in Food");
	}
	
	void piece()
	{
		System.out.println("Running piece in Food");
	}
	
	void shape()
	{
		System.out.println("Running shape in Food");
	}
	
	@Override
	void eat()
	{
		System.out.println("Running eat in Food");
	}
	
	@Override
	void drink()
	{
		System.out.println("Running drink in Food");
	}
	
	@Override
	void parcel()
	{
		System.out.println("Running parcel in Food");
	}
	@Override
	void supply()
	{
		System.out.println("Running supply in Food");
	}
}