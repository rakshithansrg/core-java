class Owner
{
	String name="Raksha";
	String email="Raksha@gmail.com";
	Address permanetAddress;
	Address temporaryAddress;
	
	Owner(Address permanetAddress,Address temporaryAddress)
	{
		this.permanetAddress=permanetAddress;
		this.temporaryAddress=temporaryAddress;
	}
	
	void show()
	{
		System.out.println("-----Owner------");
		System.out.println("Name :"+this.name);
		System.out.println("Email :"+this.email);
		System.out.println("permanetAddress :"+this.permanetAddress);
		if(this.permanetAddress!=null)
		{
			this.permanetAddress.show();
		}
		System.out.println("temporaryAddress :"+this.temporaryAddress);
		if(this.temporaryAddress!=null)
		{
		    	System.out.println("Same as permanetAddress");
		}
	}
	
}