class OrnamentUnique
{
	public static void main(String[] args)
	{
		Ornament ornament=new Ornament();
		{
			System.out.println("Types :"+ornament.types);
			System.out.println("No of Types :"+ornament.noOfTypes);
			System.out.println("Design :"+ornament.design);
			System.out.println("Price in Grams :"+ornament.priceInGrms);
		}
		Ornament ornament1=new Ornament("Silver");
		{
			System.out.println("Types :"+ornament1.types);
			System.out.println("No of Types :"+ornament1.noOfTypes);
			System.out.println("Design :"+ornament1.design);
			System.out.println("Price in Grams :"+ornament1.priceInGrms);
		}
		Ornament ornament2=new Ornament("Silver",6);
		{
			System.out.println("Types :"+ornament2.types);
			System.out.println("No of Types :"+ornament2.noOfTypes);
			System.out.println("Design :"+ornament2.design);
			System.out.println("Price in Grams :"+ornament2.priceInGrms);
		}
		Ornament ornament3=new Ornament("Silver",6);
		{
			System.out.println("Types :"+ornament3.types);
			System.out.println("No of Types :"+ornament3.noOfTypes);
			System.out.println("Design :"+ornament3.design);
			System.out.println("Price in Grams :"+ornament3.priceInGrms);
		}
		Ornament ornament4=new Ornament("Silver",6,"flower",100);
		{
			System.out.println("Types :"+ornament4.types);
			System.out.println("No of Types :"+ornament4.noOfTypes);
			System.out.println("Design :"+ornament4.design);
			System.out.println("Price in Grams :"+ornament4.priceInGrms);
		}
		
	}
}