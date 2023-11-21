class HandCamera extends Camera
{
	int weight;
	
	HandCamera()
	{
		super(10,45);
		System.out.println("no arg const in Hand Camera");
	}
	void handy(int weight)
	{
		this.weight=weight;
	}
}