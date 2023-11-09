class CAOBHLMain
{
	public static void main(String[] main)
	{
		City city=new City();
		
		Address address=new Address();
		address.setStreet("Bommanahalli");
		address.setPinCode(577541);
		address.setCity(city);
		
		Owner owner=new Owner(address,address);
		
		String[] cities=new String[5];
		cities[0]="Sirigere";
		cities[1]="Begur";
		cities[2]="DVG";
        cities[3]="Chitradurga";
		cities[4]="Shivamogga";
		
		Brand brand=new Brand();
		brand.setCities(cities);
		
		Hardware[] hardware=new Hardware[10];
		hardware[0]=new Hardware("Keyboard","wire","HP");
		hardware[1]=new Hardware("Mouse","Wire","Lenova");
		hardware[2]=new Hardware("Jack","Wire","HP");
		hardware[3]=new Hardware("Scanner","Wire","Sony");
		hardware[4]=new Hardware("Printer","Wire","Dell");
		hardware[5]=new Hardware("CPU","Wire","HP");
		hardware[6]=new Hardware("Mother BOard","wire","HP");
		hardware[7]=new Hardware("HDD","Wire","Sony");
		hardware[8]=new Hardware("RAM","wire","HP");
		hardware[9]=new Hardware("Moniter","Wire","Sony");
		
		
		Laptop laptop=new Laptop(hardware,owner,brand);
		laptop.show();
		
		
		
	}
}