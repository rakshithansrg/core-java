class Address
{
	String street;
	int pinCode;
	City city;
	
	void setStreet(String street)
	{
		this.street=street;
		
	}
	
	void setPinCode(int pinCode)
	{
		this.pinCode=pinCode;
	}
	void setCity(City city)
	{
		this.city=city;
	}
	
	void show()
	{
		System.out.println("-----Address------");
		System.out.println("Street :"+this.street);
		System.out.println("Pin Code :"+this.pinCode);
		System.out.println("City :"+this.city);
		if(this.city!=null)
		{
			this.city.show();
		}
	}
}