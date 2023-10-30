class ShowRoomUnique
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in ShowRoomUnique");
		
		ShowRoom showroom= new ShowRoom();
		{
			System.out.println("Name :"+showroom.name);
			System.out.println("Brand : "+showroom.brand);
			System.out.println("No OF Vehicle :"+showroom.noOfVehicles);
			System.out.println("Cost :"+showroom.cost);
			System.out.println("Manager :"+showroom.manager);
			System.out.println("No of Workers :"+showroom.noOfWorkers);
			System.out.println("Type of Vehicles :"+showroom.noOfVehicles);
			System.out.println("NO of Mechanics"+showroom.noOfMechanics);
		}
		ShowRoom showroom1= new ShowRoom("Adishakthi");
		{
			System.out.println("Name :"+showroom1.name);
			System.out.println("Brand : "+showroom1.brand);
			System.out.println("No OF Vehicle :"+showroom1.noOfVehicles);
			System.out.println("Cost :"+showroom1.cost);
			System.out.println("Manager :"+showroom1.manager);
			System.out.println("No of Workers :"+showroom1.noOfWorkers);
			System.out.println("Type of Vehicles :"+showroom1.noOfVehicles);
			System.out.println("NO of Mechanics :"+showroom1.noOfMechanics);
		}
		ShowRoom showroom2= new ShowRoom("Adishakthi","Benz");
		{
			System.out.println("Name :"+showroom2.name);
			System.out.println("Brand : "+showroom2.brand);
			System.out.println("No OF Vehicle :"+showroom2.noOfVehicles);
			System.out.println("Cost :"+showroom2.cost);
			System.out.println("Manager :"+showroom2.manager);
			System.out.println("No of Workers :"+showroom2.noOfWorkers);
			System.out.println("Type of Vehicles :"+showroom2.noOfVehicles);
			System.out.println("NO of Mechanics :"+showroom2.noOfMechanics);
		}	
		ShowRoom showroom3= new ShowRoom("Adishakthi","BMW");
		{
			System.out.println("Name :"+showroom3.name);
			System.out.println("Brand : "+showroom3.brand);
			System.out.println("No OF Vehicle :"+showroom3.noOfVehicles);
			System.out.println("Cost :"+showroom3.cost);
			System.out.println("Manager :"+showroom3.manager);
			System.out.println("No of Workers :"+showroom3.noOfWorkers);
			System.out.println("Type of Vehicles :"+showroom3.noOfVehicles);
			System.out.println("NO of Mechanics :"+showroom3.noOfMechanics);
		}	
		ShowRoom showroom4= new ShowRoom("Adishakthi","BMW",30);
		{
			System.out.println("Name :"+showroom4.name);
			System.out.println("Brand : "+showroom4.brand);
			System.out.println("No OF Vehicle :"+showroom4.noOfVehicles);
			System.out.println("Cost :"+showroom4.cost);
			System.out.println("Manager :"+showroom4.manager);
			System.out.println("No of Workers :"+showroom4.noOfWorkers);
			System.out.println("Type of Vehicles :"+showroom4.noOfVehicles);
			System.out.println("NO of Mechanics :"+showroom4.noOfMechanics);
		}
		ShowRoom showroom5= new ShowRoom("Adishakthi","BMW",30,1500000);
		{
			System.out.println("Name :"+showroom5.name);
			System.out.println("Brand : "+showroom4.brand);
			System.out.println("No OF Vehicle :"+showroom5.noOfVehicles);
			System.out.println("Cost :"+showroom5.cost);
			System.out.println("Manager :"+showroom5.manager);
			System.out.println("No of Workers :"+showroom5.noOfWorkers);
			System.out.println("Type of Vehicles :"+showroom5.noOfVehicles);
			System.out.println("NO of Mechanics :"+showroom5.noOfMechanics);
		}
		ShowRoom showroom6= new ShowRoom("Adishakthi","BMW",30,1500000,"Raksha");
		{
			System.out.println("Name :"+showroom6.name);
			System.out.println("Brand : "+showroom6.brand);
			System.out.println("No OF Vehicle :"+showroom6.noOfVehicles);
			System.out.println("Cost :"+showroom6.cost);
			System.out.println("Manager :"+showroom6.manager);
			System.out.println("No of Workers :"+showroom6.noOfWorkers);
			System.out.println("Type of Vehicles :"+showroom6.noOfVehicles);
			System.out.println("NO of Mechanics :"+showroom6.noOfMechanics);
		}
		ShowRoom showroom7= new ShowRoom("Adishakthi","BMW",30,1500000,"Raksha",50);
		{
			System.out.println("Name :"+showroom7.name);
			System.out.println("Brand : "+showroom7.brand);
			System.out.println("No OF Vehicle :"+showroom7.noOfVehicles);
			System.out.println("Cost :"+showroom7.cost);
			System.out.println("Manager :"+showroom7.manager);
			System.out.println("No of Workers :"+showroom7.noOfWorkers);
			System.out.println("Type of Vehicles :"+showroom7.noOfVehicles);
			System.out.println("NO of Mechanics :"+showroom7.noOfMechanics);
		}
		ShowRoom showroom8= new ShowRoom("Adishakthi","BMW",30,1500000,"Raksha",50,"Yamaha",4);
		{
			System.out.println("Name :"+showroom8.name);
			System.out.println("Brand : "+showroom8.brand);
			System.out.println("No OF Vehicle :"+showroom8.noOfVehicles);
			System.out.println("Cost :"+showroom8.cost);
			System.out.println("Manager :"+showroom8.manager);
			System.out.println("No of Workers :"+showroom8.noOfWorkers);
			System.out.println("Type of Vehicles :"+showroom8.noOfVehicles);
			System.out.println("NO of Mechanics :"+showroom8.noOfMechanics);
		}
	}
	
}