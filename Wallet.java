class Wallet
{
	String shape;
	String brand;
	int noOfPockets;
	double price;
	
	Wallet()
	{
		
		this("square","asd",3,345);
		System.out.println("--------------------------");
		
	}
	
	Wallet(String shape)
	{
		System.out.println("--------------------------");
		System.out.println("Wallet 1");
		this.shape=shape;
		System.out.println("--------------------------");
	
	}
	Wallet(String shape,String brand)
	{
		System.out.println("--------------------------");
		System.out.println("Wallet 2");
		this.shape=shape;
		this.brand=brand;
		System.out.println("--------------------------");
		
	}
	Wallet(String shape,String brand,int noOfPockets)
	{
		
		System.out.println("--------------------------");
		System.out.println("Wallet 3");
		this.shape=shape;
		this.brand=brand;
		this.noOfPockets=noOfPockets;
		System.out.println("--------------------------");
		
	}
	Wallet(String shape,String brand,int noOfPockets,double price)
	{
		System.out.println("--------------------------");
		System.out.println("Wallet 4");
		this.shape=shape;
		this.brand=brand;
		this.noOfPockets=noOfPockets;
		this.price=price;
		System.out.println("--------------------------");
	}
}