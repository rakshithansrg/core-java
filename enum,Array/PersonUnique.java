class PersonUnique
{
	public static void main(String[] mail)
	{
		
		
		System.out.println("Starting main");
		Email[] email= new Email[4];
		
		email[0]=new Email("email.com",171,"Raksha","N");
		email[1]=new Email("gmail.com",177,"Bhanu","N");
		email[2]=new Email("yahoo.com",717,"Bhagya","HN");
		email[3]=new Email("facebook.com",771,"Dhanu","V");
		
		Person person = new Person("Rakhsitha",email);
		person.showInfo();
		
		System.out.println("Ending main");
	}

}