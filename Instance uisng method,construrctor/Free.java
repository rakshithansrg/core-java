class Free
{
	String what;
	String why;
	boolean freeForAll;
	
	Free()
	{
        
		System.out.println("Starting at Free");
	}
	Free(String what,String why,boolean freeForAll)
	{
		this.what=what;
		this.why=why;
		this.freeForAll=freeForAll;
		
	}
	void displayInfo()
	{
		System.out.println("What :"+this.what);
		System.out.println("Why :"+this.why);
		System.out.println("Free :"+this.freeForAll);
		
		
	}
	
}