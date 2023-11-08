class Person
{
	String name;
	Email[] email;
	
	Person()
	{
		System.out.println("Start default const");
	}
	
    void setName(String name)
	{
		this.name=name;
		
	}
	void setMail(Email[] email)
	{
		this.email=email;
	}
	
	void showInfo()
	{
		System.out.println("Name : "+this.name);
		System.out.println("Email :"+this.email);
		if(this.email!=null)
		{
			for(int i=0;i<this.email.length;i++)
			{
			    Email ref=this.email[i];
				System.out.println("Ref :"+ref );
				
			}
		}
	}
}