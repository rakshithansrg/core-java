class Email
{
	String domain=".gmail";
	int id=2;
	String fname="Raksha";
	String lname="N";
	Email1 email1=Email1.RAKSHA;
	
	Email()
	{
		
	}
	
	void setMaill(String domain,int id,String fname,String lname)
	{
		System.out.println("Starting Const from Email");
		this.domain=domain;
		this.id=id;
		this.fname=fname;
		this.lname=lname;
		
		System.out.println("Ending from Email");
	}
	 
	void showInfo()
	
	{
		System.out.println("Starting from showInfo in Email");
		System.out.println("Domain :"+this.domain);
		System.out.println("ID :"+this.id);
		System.out.println("First Name :"+this.fname);
		System.out.println("Last Name:"+this.lname);
		System.out.println("Email :"+this.email1);
		System.out.println("Ending from showInfo in Email");
	}
	
	
}