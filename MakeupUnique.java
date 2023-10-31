class MakeupUnique
{
	public static void main(String[] args)
	{
		MakeupKit makeupkit=new MakeupKit();
		{
			System.out.println("No of Items :"+makeupkit.noOfItems);
			System.out.println("Cost :"+makeupkit.cost);
			System.out.println("Brand :"+makeupkit.brand);
			System.out.println("Ratings :"+makeupkit.ratings);
		}
		MakeupKit makeupkit1=new MakeupKit(22);
		{
			System.out.println("No of Items :"+makeupkit1.noOfItems);
			System.out.println("Cost :"+makeupkit1.cost);
			System.out.println("Brand :"+makeupkit1.brand);
			System.out.println("Ratings :"+makeupkit1.ratings);
		}
		MakeupKit makeupkit2=new MakeupKit(22,334.5);
		{
			System.out.println("No of Items :"+makeupkit2.noOfItems);
			System.out.println("Cost :"+makeupkit2.cost);
			System.out.println("Brand :"+makeupkit2.brand);
			System.out.println("Ratings :"+makeupkit2.ratings);
		}
		MakeupKit makeupkit3=new MakeupKit(22,334.5,"ABC");
		{
			System.out.println("No of Items :"+makeupkit3.noOfItems);
			System.out.println("Cost :"+makeupkit3.cost);
			System.out.println("Brand :"+makeupkit3.brand);
			System.out.println("Ratings :"+makeupkit3.ratings);
		}
		MakeupKit makeupkit4=new MakeupKit(22,334.5,"ABC",3.4);
		{
			System.out.println("No of Items :"+makeupkit4.noOfItems);
			System.out.println("Cost :"+makeupkit4.cost);
			System.out.println("Brand :"+makeupkit4.brand);
			System.out.println("Ratings :"+makeupkit4.ratings);
		}
	}
}