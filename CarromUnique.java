class CarromUnique
{
	public static void main(String[] args)
	{
		Carrom carrom=new Carrom();
		{
			System.out.println("======================");
			System.out.println("NO of pans :"+carrom.noOfPans);
			System.out.println("Color of Pans :"+carrom.colorOfPans);
			System.out.println("Shape :"+carrom.shape);
			System.out.println("Blocks :"+carrom.blocks);
			System.out.println("Cost :"+carrom.cost);
			System.out.println("======================");
		}
		Carrom carrom1=new Carrom(29);
		{
			System.out.println("NO of pans :"+carrom1.noOfPans);
			System.out.println("Color of Pans :"+carrom1.colorOfPans);
			System.out.println("Shape :"+carrom1.shape);
			System.out.println("Blocks :"+carrom1.blocks);
			System.out.println("Cost :"+carrom1.cost);
			System.out.println("======================");
		}
		Carrom carrom2=new Carrom(29,"Red");
		{
			System.out.println("NO of pans :"+carrom2.noOfPans);
			System.out.println("Color of Pans :"+carrom2.colorOfPans);
			System.out.println("Shape :"+carrom2.shape);
			System.out.println("Blocks :"+carrom2.blocks);
			System.out.println("Cost :"+carrom2.cost);
			System.out.println("======================");
		}
		Carrom carrom3=new Carrom(29,"Red","Square");
		{
			System.out.println("NO of pans :"+carrom3.noOfPans);
			System.out.println("Color of Pans :"+carrom3.colorOfPans);
			System.out.println("Shape :"+carrom3.shape);
			System.out.println("Blocks :"+carrom3.blocks);
			System.out.println("Cost :"+carrom3.cost);
			System.out.println("======================");
		}
		Carrom carrom4=new Carrom(29,"Red","Square",4,4000);
		{
			System.out.println("NO of pans :"+carrom4.noOfPans);
			System.out.println("Color of Pans :"+carrom4.colorOfPans);
			System.out.println("Shape :"+carrom4.shape);
			System.out.println("Blocks :"+carrom4.blocks);
			System.out.println("Cost :"+carrom4.cost);
		}
	}
}