class Technology
{
	String name;
	int durationmonth;
	String location;
	long cost;
	double ratings;
	String language;
	long pincode;
	String trainername;
	int typesoftechnologies;
	double Strength;
	int MocktestinMonth;
	double highpackage;


	Technology(String name,int durationmonth,String location,long cost,double ratings,String language,long pincode,String trainername,int typesoftechnologies,double Strength,int MocktestinMonth,double highpackage)
	{
		this.name=name;
		this.durationmonth=durationmonth;
		this.location=location;
		this.cost=cost;
		this.ratings=ratings;
		this.language=language;
		this.pincode=pincode;
		this.trainername=trainername;
		this.typesoftechnologies=typesoftechnologies;
		this.Strength=Strength;
		this.MocktestinMonth=MocktestinMonth;
		this.highpackage=highpackage;
	}
	void infoShow()
	{
		System.out.println("Name is :"+this.name);
		System.out.println("Durationmonth name is :"+this.durationmonth);
		System.out.println("Location is :"+this.location);
		System.out.println("Cost is :"+this.cost);
		System.out.println("Ratings is :"+this.ratings);
		System.out.println("Language is :"+this.language);
		System.out.println("Pincode is :"+this.pincode);
		System.out.println("Trainername is :"+this.trainername);
		System.out.println("Typesoftechnologies is :"+this.typesoftechnologies);
		System.out.println("Strength is :"+this.Strength);
		System.out.println("MocktestinMonth  is :"+this.MocktestinMonth);
		System.out.println("Highpackage is :"+this.highpackage);
	}
}