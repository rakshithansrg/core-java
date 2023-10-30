class KeyboardUnique
{
	public static void main(String[] args)
	{
		System.out.println("Started main in KeyboardUnique");
		Keyboard keyboard=new Keyboard();
		{
			System.out.println("Brand :"+keyboard.brand);
			System.out.println("color:"+keyboard.color);
			System.out.println("No of Keys :"+keyboard.noOfKeys);
			System.out.println("Type :"+keyboard.type);
			System.out.println("Cost :"+keyboard.cost);
		}
		Keyboard keyboard1=new Keyboard("KEY");
		{
			System.out.println("Brand :"+keyboard1.brand);
			System.out.println("color:"+keyboard1.color);
			System.out.println("No of Keys :"+keyboard1.noOfKeys);
			System.out.println("Type :"+keyboard1.type);
			System.out.println("Cost :"+keyboard1.cost);
		}
		
		Keyboard keyboard2=new Keyboard("KEY","Black");
		{
			System.out.println("Brand :"+keyboard2.brand);
			System.out.println("color:"+keyboard2.color);
			System.out.println("No of Keys :"+keyboard2.noOfKeys);
			System.out.println("Type :"+keyboard2.type);
			System.out.println("Cost :"+keyboard2.cost);
		}
		Keyboard keyboard3=new Keyboard("KEY","Black",50);
		{
			System.out.println("Brand :"+keyboard3.brand);
			System.out.println("color:"+keyboard3.color);
			System.out.println("No of Keys :"+keyboard3.noOfKeys);
			System.out.println("Type :"+keyboard3.type);
			System.out.println("Cost :"+keyboard3.cost);
		}
		Keyboard keyboard4=new Keyboard("KEY","Black",50,"Wireless");
		{
			System.out.println("Brand :"+keyboard4.brand);
			System.out.println("color:"+keyboard4.color);
			System.out.println("No of Keys :"+keyboard4.noOfKeys);
			System.out.println("Type :"+keyboard4.type);
			System.out.println("Cost :"+keyboard4.cost);
		}
		Keyboard keyboard5=new Keyboard("KEY","Black",50,"Wireless",200.0);
		{
			System.out.println("Brand :"+keyboard5.brand);
			System.out.println("color:"+keyboard5.color);
			System.out.println("No of Keys :"+keyboard5.noOfKeys);
			System.out.println("Type :"+keyboard5.type);
			System.out.println("Cost :"+keyboard5.cost);
		}
		
	}
}
