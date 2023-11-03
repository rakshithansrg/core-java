class MonthUnique
{
	public static void main(String[] args)
	{
		System.out.println("Start main in MonthTrainee");
	
		Month month=new Month();
		month.displayMonth();
	
		System.out.println("===========================");

		Month month1=new Month("Janavary",31,5,2);
		month1.displayMonth();
		
		System.out.println("===========================");
	
		Month month2=new Month("Febraury",28,4,0);
		month2.displayMonth();
	
		System.out.println("===========================");
	
		Month month3=new Month("March",31,4,3);
		month3.displayMonth();
	
		System.out.println("===========================");
	
		Month month4=new Month("April",30,5,3);
		month4.displayMonth();
	
		System.out.println("===========================");
	
		Month month5=new Month("May",31,4,2);
		month5.displayMonth();
	
		System.out.println("===========================");
	
		Month month6=new Month("June",30,4,2);
		month6.displayMonth();
	
		System.out.println("===========================");
	
		Month month7=new Month("July",31,5,0);
		month7.displayMonth();
	
		System.out.println("===========================");
	
		Month month8=new Month("August",31,4,3);
		month8.displayMonth();
	
		System.out.println("===========================");
	
		Month month9=new Month("September",30,4,3);
		month9.displayMonth();
		
		System.out.println("===========================");
	
		Month month10=new Month("Octomber",31,5,5);
		month10.displayMonth();
	
		System.out.println("===========================");
	
		Month month11=new Month("November",30,4,3);
		month11.displayMonth();
	
		
	}
}