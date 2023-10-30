class ShowRoom
{
	String name;
	String brand;
	int noOfVehicles;
	double cost;
	String manager;
	int noOfWorkers;
	String typeOfVehicle;
	int noOfMechanics;
	
	ShowRoom()
	{
		System.out.println("----------------------");
		System.out.println("Started in ShowRoom");
		System.out.println("----------------------");
	}
	ShowRoom(String name)
	{ 
	    this.name=name; 
		System.out.println("----------------------");
		System.out.println("Started in ShowRoom1");
		System.out.println("----------------------");
	}
	ShowRoom(String name,String brand)
	{ 
	    this.name=name; 
		this.brand=brand;
		System.out.println("----------------------");
		System.out.println("Started in ShowRoom2");
		System.out.println("----------------------");
	}
	ShowRoom(String name,String brand,int noOfVehicles)
	{ 
	    this.name=name; 
		this.brand=brand;
		this.noOfVehicles=noOfVehicles;
		System.out.println("----------------------");
		System.out.println("Started in ShowRoom3");
		System.out.println("----------------------");
	}
	ShowRoom(String name,String brand,int noOfVehicles,double cost)
	{ 
	    this.name=name; 
		this.brand=brand;
		this.noOfVehicles=noOfVehicles;
		this.cost=cost;
		System.out.println("----------------------");
		System.out.println("Started in ShowRoom4");
		System.out.println("----------------------");
	}
	ShowRoom(String name,String brand,int noOfVehicles,double cost,String manager)
	{ 
	    this.name=name; 
		this.brand=brand;
		this.noOfVehicles=noOfVehicles;
		this.cost=cost;
		this.manager=manager;
		System.out.println("----------------------");
		System.out.println("Started in ShowRoom5");
		System.out.println("----------------------");
	}
	ShowRoom(String name,String brand,int noOfVehicles,double cost,String manager,int noOfWorkers)
	{ 
	    this.name=name; 
		this.brand=brand;
		this.noOfVehicles=noOfVehicles;
		this.cost=cost;
		this.manager=manager;
		this.noOfWorkers=noOfWorkers;
		System.out.println("----------------------");
		System.out.println("Started in ShowRoom6");
		System.out.println("----------------------");
	}
	ShowRoom(String name,String brand,int noOfVehicles,double cost,String manager,int noOfWorkers,String typeOfVehicle)
	{ 
	    this.name=name; 
		this.brand=brand;
		this.noOfVehicles=noOfVehicles;
		this.cost=cost;
		this.manager=manager;
		this.noOfWorkers=noOfWorkers;
		this.typeOfVehicle=typeOfVehicle;
		System.out.println("----------------------");
		System.out.println("Started in ShowRoom7");
		System.out.println("----------------------");
	}
	ShowRoom(String name,String brand,int noOfVehicles,double cost,String manager,int noOfWorkers,String typeOfVehicle,int noOfMechanics)
	{ 
	    this.name=name; 
		this.brand=brand;
		this.noOfVehicles=noOfVehicles;
		this.cost=cost;
		this.manager=manager;
		this.noOfWorkers=noOfWorkers;
		this.typeOfVehicle=typeOfVehicle;
		this.noOfMechanics=noOfMechanics;
		System.out.println("----------------------");
		System.out.println("Started in ShowRoom8");
		System.out.println("----------------------");
	}
}