class PersonUnique
{
	public static void main(String... args)
	{
		Person person=new Person();
		Developer developer=new Developer();
		Tester test=new Tester();
		BusinessAnalyst ba=new BusinessAnalyst();
		ProductOwner pro=new ProductOwner();
		DataBaseDeveloper dbd=new DataBaseDeveloper();
		Devops devops=new Devops();
		
		Project pr=new Project();
		pr.validate(person);
		pr.validate(developer);
		pr.validate(test);
		pr.validate(ba);
		pr.validate(pro);
		pr.validate(dbd);
		pr.validate(devops);
		
	}
}