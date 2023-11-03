class Month
{
	String name;
	int noOfDays;
	int noOfWeekEnds;
	int noOfHolidays;

	Month()
	{
		System.out.println("Started at Month");
	}
	Month(String name,int noOfDays,int noOfWeekEnds,int noOfHolidays)
	{
		this.name=name;
		this.noOfDays=noOfDays;
		this.noOfWeekEnds=noOfWeekEnds;
		this.noOfHolidays=noOfHolidays;
	
	}
	void displayMonth()
	{
		System.out.println("Month name :"+this.name);
		System.out.println("Month noOfDays :"+this.noOfDays);
		System.out.println("Month noOfWeekEnds :"+this.noOfWeekEnds);
		System.out.println("Month noOfHolidays :"+this.noOfHolidays);
	}

}