class PrinterUnique
{
	public static void main(String[] args)
	{
		Printer printer=new Printer();
		{
			System.out.println("Model :"+printer.model);
			System.out.println("Capacity :"+printer.capacity);
			System.out.println("Cost :"+printer.cost);
			System.out.println("Brand :"+printer.brand);
			System.out.println("NO of pages :"+printer.noOfPages);
		}
		Printer printer1=new Printer("Raksha");
		{
			System.out.println("Model :"+printer1.model);
			System.out.println("Capacity :"+printer1.capacity);
			System.out.println("Cost :"+printer1.cost);
			System.out.println("Brand :"+printer1.brand);
			System.out.println("NO of pages :"+printer1.noOfPages);
		}
		Printer printer2=new Printer("Raksha",123,1200);
		{
			System.out.println("Model :"+printer2.model);
			System.out.println("Capacity :"+printer2.capacity);
			System.out.println("Cost :"+printer2.cost);
			System.out.println("Brand :"+printer2.brand);
			System.out.println("NO of pages :"+printer2.noOfPages);
		}
		Printer printer3=new Printer("Raksha",123);
		{
			System.out.println("Model :"+printer3.model);
			System.out.println("Capacity :"+printer3.capacity);
			System.out.println("Cost :"+printer3.cost);
			System.out.println("Brand :"+printer3.brand);
			System.out.println("NO of pages :"+printer3.noOfPages);
		}
		Printer printer4=new Printer("Raksha",123,11500,"Bhanu",200);
		{
			System.out.println("Model :"+printer4.model);
			System.out.println("Capacity :"+printer4.capacity);
			System.out.println("Cost :"+printer4.cost);
			System.out.println("Brand :"+printer4.brand);
			System.out.println("NO of pages :"+printer4.noOfPages);
		}
	
	}
}