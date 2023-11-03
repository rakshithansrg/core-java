class Course
{
  String name;
  int durationInMonth;
  int technologies;
  double courseFee;
  String location;
  double courseRatings;
  boolean qualityOfCourse;
  
  Course(String name,int durationInMonth,int technologies, double courseFee,String location,
  double courseRatings,boolean qualityOfCourse)
  {
	  this.name=name;
	  this.durationInMonth=durationInMonth;
	  this.technologies=technologies;
	  this.courseFee=courseFee;
	  this.location=location;
	  this.courseRatings=courseRatings;
	  this.qualityOfCourse=qualityOfCourse;
  }
  void displayCourse()
  {
	  System.out.println("Course Name :"+this.name);
	  System.out.println("Course durationInMonth :"+this.durationInMonth);
	  System.out.println("Course technologies :"+this.technologies);
	  System.out.println("Course courseFee :"+this.courseFee);
	  System.out.println("Course location :"+this.location);
	  System.out.println("Course courseRatings :"+this.courseRatings);
	  System.out.println("Course qualityOfCourse :"+this.qualityOfCourse);

  }
  
}