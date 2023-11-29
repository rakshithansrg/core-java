class CAOBHLMain
{
	public static void main(String[] main)
	{
		City city=new City("Bommanahalli");
		
		Address address=new Address();
		address.setStreet("Bommanahalli");
		address.setPinCode(577541);
		address.setCity(city);
		
		Owner owner=new Owner(address,address);
		
		City cities=new City("Bommanahalli");
		City cities1=new City("Dvg");
		City cities2=new City("Chitradurga");
		City cities3=new City("Banglore");
		City cities4=new City("Bommanahalli");
		City[] cityArray={cities,cities1,cities2,cities3,cities4};
		
		
		Brand brand=new Brand(cityArray);
		
		
		
		Hardware[] hardware=new Hardware[10];
		
		hardware[0]=new Hardware("Keyboard","wire",brand);
		hardware[1]=new Hardware("Mouse","Wire",brand);
		hardware[2]=new Hardware("Jack","Wire",brand);
		hardware[3]=new Hardware("Scanner","Wire",brand);
		hardware[4]=new Hardware("Printer","Wire",brand);
		hardware[5]=new Hardware("CPU","Wire",brand);
		hardware[6]=new Hardware("Mother BOard","wire",brand);
		hardware[7]=new Hardware("HDD","Wire",brand);
		hardware[8]=new Hardware("RAM","wire",brand);
		hardware[9]=new Hardware("Moniter","Wire",brand);
		
		
		Laptop laptop=new Laptop(hardware,owner,brand);
		laptop.show();
		
		
		
	}
}