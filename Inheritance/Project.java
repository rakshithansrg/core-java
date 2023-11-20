class Project
{
	Project()
	{
		System.out.println("Starting no arg const in Project");
	}
	
	void validate(Person person)
	{
		System.out.println("Person :"+person);
		if(person!=null)
		{
			if(person instanceof Developer)
			{
				Developer dev=(Developer)person;
				dev.eat();
				dev.sleep();
			}
			if(person instanceof BusinessAnalyst)
			{
				BusinessAnalyst bs=(BusinessAnalyst)person;
				bs.checkRequirement();
			}
			if(person instanceof ProductOwner)
			{
				ProductOwner po=(ProductOwner)person;
				po.validate();
			}
			if(person instanceof DataBaseDeveloper)
			{
				DataBaseDeveloper dbd=(DataBaseDeveloper)person;
				dbd.runScripts();
			}
			if(person instanceof Devops)
			{
				Devops devops=(Devops)person;
				devops.runBuild();
			}
			if(person instanceof Tester)
			{
				Tester tester=(Tester)person;
				tester.qualityCheck();
			}
		}
	}
}