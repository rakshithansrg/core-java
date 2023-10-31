class RocketUnique
{
	public static void main(String[] main)
	{
		Rocket rocket=new Rocket();
		{
			System.out.println("Speed :"+rocket.speed);
			System.out.println("Engine :"+rocket.engine);
			System.out.println("Name :"+rocket.name);
			System.out.println("Length :"+rocket.length);
		}
		Rocket rocket1=new Rocket(13334);
		{
			System.out.println("Speed :"+rocket1.speed);
			System.out.println("Engine :"+rocket1.engine);
			System.out.println("Name :"+rocket1.name);
			System.out.println("Length :"+rocket1.length);
		}
		Rocket rocket2=new Rocket(13334,"ADG");
		{
			System.out.println("Speed :"+rocket2.speed);
			System.out.println("Engine :"+rocket2.engine);
			System.out.println("Name :"+rocket2.name);
			System.out.println("Length :"+rocket2.length);
		}
		Rocket rocket3=new Rocket(13334,"ADG","RAK");
		{
			System.out.println("Speed :"+rocket3.speed);
			System.out.println("Engine :"+rocket3.engine);
			System.out.println("Name :"+rocket3.name);
			System.out.println("Length :"+rocket3.length);
		}
		Rocket rocket4=new Rocket(13334,"ADG","RAK",124);
		{
			System.out.println("Speed :"+rocket4.speed);
			System.out.println("Engine :"+rocket4.engine);
			System.out.println("Name :"+rocket4.name);
			System.out.println("Length :"+rocket4.length);
		}
	}
}