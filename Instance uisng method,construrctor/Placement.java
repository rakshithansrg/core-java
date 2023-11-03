class Placement
{
	String name;
	String location;
	String department;
	double rating;
	int fees;
	String company;
	String sub;
	boolean quality;
	int noofCandidates;
	int noofInterviews;
	int candNo;
	String hrName;
	
	Placement()
	{
		System.out.println("Starting at Placement");
	}
	Placement(String name,String location,String department,double rating,int fees,String company,String sub,boolean quality,
	           int noofCandidates,int noofInterviews,int candNo,String hrName)
   {
	   this.name=name;
	   this.location=location;
	   this.department=department;
	   this.rating=rating;
	   this.fees=fees;
	   this.company=company;
	   this.sub=sub;
	   this.quality=quality;
	   this.noofCandidates=noofCandidates;
	   this.candNo=candNo;
	   this.hrName=hrName;
   }
   void displayInfo()
   {
	   System.out.println("name :"+this.name);
	   System.out.println("location :"+this.location);
	   System.out.println("department :"+this.department);
	   System.out.println("rating :"+this.rating);
	   System.out.println("fees :"+this.fees);
	   System.out.println("company :"+this.company);
	   System.out.println("sub :"+this.sub);
	   System.out.println("quality :"+this.quality);
	   System.out.println("noofCandidates :"+this.noofCandidates);
	   System.out.println("namecandNo :"+this.candNo);
	   System.out.println("hrName :"+this.hrName);
    }
	   
}