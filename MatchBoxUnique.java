class MatchBoxUnique
{
	public static void main(String[] args)
	{
		System.out.println("Started main in MatchBoxUnique");
		MatchBox matchbox=new MatchBox();
		{
			System.out.println("Brand :"+matchbox.brand);
			System.out.println("No of Sticks :"+matchbox.noOfStick);
			System.out.println("Length :"+matchbox.length);
			System.out.println("Price :"+matchbox.price);
			System.out.println("Size :"+matchbox.size);
			System.out.println("Weight :"+matchbox.weight);
			System.out.println("Type :"+matchbox.type);
		}
		MatchBox matchbox1=new MatchBox("Raksha");
		{
			System.out.println("Brand :"+matchbox1.brand);
			System.out.println("No of Sticks :"+matchbox1.noOfStick);
			System.out.println("Length :"+matchbox1.length);
			System.out.println("Price :"+matchbox1.price);
			System.out.println("Size :"+matchbox1.size);
			System.out.println("Weight :"+matchbox1.weight);
			System.out.println("Type :"+matchbox1.type);
		}
		MatchBox matchbox2=new MatchBox("Raksha",30);
		{
			System.out.println("Brand :"+matchbox2.brand);
			System.out.println("No of Sticks :"+matchbox2.noOfStick);
			System.out.println("Length :"+matchbox2.length);
			System.out.println("Price :"+matchbox2.price);
			System.out.println("Size :"+matchbox2.size);
			System.out.println("Weight :"+matchbox2.weight);
			System.out.println("Type :"+matchbox2.type);
		}
		MatchBox matchbox3=new MatchBox("Raksha",30,3.5);
		{
			System.out.println("Brand :"+matchbox3.brand);
			System.out.println("No of Sticks :"+matchbox3.noOfStick);
			System.out.println("Length :"+matchbox3.length);
			System.out.println("Price :"+matchbox3.price);
			System.out.println("Size :"+matchbox3.size);
			System.out.println("Weight :"+matchbox3.weight);
			System.out.println("Type :"+matchbox3.type);
		}
		MatchBox matchbox4=new MatchBox("Raksha",30,3.5,2.0);
		{
			System.out.println("Brand :"+matchbox4.brand);
			System.out.println("No of Sticks :"+matchbox4.noOfStick);
			System.out.println("Length :"+matchbox4.length);
			System.out.println("Price :"+matchbox4.price);
			System.out.println("Size :"+matchbox4.size);
			System.out.println("Weight :"+matchbox4.weight);
			System.out.println("Type :"+matchbox4.type);
		}
		MatchBox matchbox5=new MatchBox("Raksha",30,3.5,2.0,"Small");
		{
			System.out.println("Brand :"+matchbox5.brand);
			System.out.println("No of Sticks :"+matchbox5.noOfStick);
			System.out.println("Length :"+matchbox5.length);
			System.out.println("Price :"+matchbox5.price);
			System.out.println("Size :"+matchbox5.size);
			System.out.println("Weight :"+matchbox5.weight);
			System.out.println("Type :"+matchbox5.type);
		}
		MatchBox matchbox6=new MatchBox("Raksha",30,3.5,2.0,"small",5);
		{
			System.out.println("Brand :"+matchbox6.brand);
			System.out.println("No of Sticks :"+matchbox6.noOfStick);
			System.out.println("Length :"+matchbox6.length);
			System.out.println("Price :"+matchbox6.price);
			System.out.println("Size :"+matchbox6.size);
			System.out.println("Weight :"+matchbox6.weight);
			System.out.println("Type :"+matchbox6.type);
		}
		MatchBox matchbox7=new MatchBox("Raksha",30,3.5,2.0,"small",5,"Plastic");
		{
			System.out.println("Brand :"+matchbox7.brand);
			System.out.println("No of Sticks :"+matchbox7.noOfStick);
			System.out.println("Length :"+matchbox7.length);
			System.out.println("Price :"+matchbox7.price);
			System.out.println("Size :"+matchbox7.size);
			System.out.println("Weight :"+matchbox7.weight);
			System.out.println("Type :"+matchbox7.type);
		}
	}
}