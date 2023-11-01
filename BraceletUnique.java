class BraceletUnique
{
	public static void main(String[] args)
	{
		Bracelet bracelet=new Bracelet();
		{
			System.out.println("=======================");
			System.out.println("Desing :"+bracelet.design);
			System.out.println("Weight :"+bracelet.weight);
			System.out.println("Metal :"+bracelet.metal);
			System.out.println("Cost :"+bracelet.cost);
			System.out.println("Size :"+bracelet.size);
			System.out.println("=======================");
	    }
		Bracelet bracelet1=new Bracelet("pecock");
		{
			System.out.println("Desing :"+bracelet1.design);
			System.out.println("Weight :"+bracelet1.weight);
			System.out.println("Metal :"+bracelet1.metal);
			System.out.println("Cost :"+bracelet1.cost);
			System.out.println("Size :"+bracelet1.size);
			System.out.println("=======================");
	    }
		Bracelet bracelet2=new Bracelet("pecock",12);
		{
			System.out.println("Desing :"+bracelet2.design);
			System.out.println("Weight :"+bracelet2.weight);
			System.out.println("Metal :"+bracelet2.metal);
			System.out.println("Cost :"+bracelet2.cost);
			System.out.println("Size :"+bracelet2.size);
			System.out.println("=======================");
	    }
		Bracelet bracelet3=new Bracelet("pecock",12,"Gold");
		{
			System.out.println("Desing :"+bracelet3.design);
			System.out.println("Weight :"+bracelet3.weight);
			System.out.println("Metal :"+bracelet3.metal);
			System.out.println("Cost :"+bracelet3.cost);
			System.out.println("Size :"+bracelet3.size);
			System.out.println("=======================");
	    }
		Bracelet bracelet4=new Bracelet("pecock",12,"Gold",40000,"Large");
		{
			System.out.println("Desing :"+bracelet4.design);
			System.out.println("Weight :"+bracelet4.weight);
			System.out.println("Metal :"+bracelet4.metal);
			System.out.println("Cost :"+bracelet4.cost);
			System.out.println("Size :"+bracelet4.size);
			System.out.println("=======================");
	    }
	}
}