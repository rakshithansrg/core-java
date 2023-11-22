class FoodMain
{
	public static void main(String... args)
	{
		Cake ck1=new Cake();
		
		Cake ck=new Cake("Jamun","sweet",4,100,2,50,"cake",true,"cream","mantoori","red","chocolate");
		ck.toEat();
		ck.shape();
		ck.piece();
		ck.taste();
		ck.eat();
		ck.drink();
		ck.parcel();
		ck.supply();
		System.out.println("Name :"+ck.name);
		System.out.println("Types :"+ck.types);
		System.out.println("No of Items :"+ck.noOfItems);
		System.out.println("Quantity :"+ck.quantity);
		System.out.println("Quality :"+ck.quality);
		System.out.println("Cost :"+ck.cost);
		System.out.println("Variety :"+ck.variety);
		System.out.println("Hygin :"+ck.hygin);
		System.out.println("Sweet :"+ck.sweet);
		System.out.println("snacks :"+ck.snacks);
		System.out.println("Color :"+ck.color);
		System.out.println("Flavor :"+ck.flavor);
		
		System.out.println("=============================");
		
		Food fd=new Food();
		
		Food fd1=new Food("Jamun","sweet",4,100,2,50,"cake",true,"cream","mantoori");
		fd1.eat();
		fd1.drink();
		fd1.parcel();
		fd1.supply();
		fd1.energy();
		fd1.give();
		fd1.recive();
		fd1.buy();
		fd1.parcel1();
		fd1.waste();
		fd1.sell();
		System.out.println("Name :"+ck.name);
		System.out.println("Types :"+ck.types);
		System.out.println("No of Items :"+ck.noOfItems);
		System.out.println("Quantity :"+ck.quantity);
		System.out.println("Quality :"+ck.quality);
		System.out.println("Cost :"+ck.cost);
		System.out.println("Variety :"+ck.variety);
		System.out.println("Hygin :"+ck.hygin);
		System.out.println("Sweet :"+ck.sweet);
		System.out.println("snacks :"+ck.snacks);
	}
}

