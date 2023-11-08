class PersonUnique
{
	public static void main(String[] mail)
	{
		
		Email email2=new Email();
		email2.setMaill("Raksha",23,"Ras","N");
		email2.showInfo();
		
		Email email=new Email();
		email.setMaill("Banu",23,"Ba","N");
		email.showInfo();
		
		Email email1=new Email();
		email1.setMaill(".mail",3,"Bhanu","N");
		email1.showInfo();
		
		
		
		Person person=new Person();
		person.setName("Rakhsa");
		person.showInfo();
		
		Email[] emailArray=new Email[4];
		emailArray[2]=email;
		emailArray[1]=email1;
		emailArray[0]=email2;
		
		Email mai=emailArray[3];
		
		
		
		System.out.println(emailArray[1]);
		Email ref=emailArray[1];
		
		
		person.showInfo();
	}
}