class KeyChainUnique
{
	public static void main(String[] args)
	{
		KeyChain keychain=new KeyChain();
		{
			System.out.println("======================");
			System.out.println("Design :"+keychain.design );
			System.out.println("Cost :"+keychain.cost);
			System.out.println("No of Keys :"+keychain.noOfKeys);
			System.out.println("Type :"+keychain.type);
			System.out.println("usedTO :"+keychain.usedTO);
			System.out.println("======================");
		}
		KeyChain keychain1=new KeyChain("Flower");
		{
			System.out.println("Design :"+keychain1.design );
			System.out.println("Cost :"+keychain1.cost);
			System.out.println("No of Keys :"+keychain1.noOfKeys);
			System.out.println("Type :"+keychain1.type);
			System.out.println("usedTO :"+keychain1.usedTO);
			System.out.println("======================");
		}
		KeyChain keychain2=new KeyChain("Flower",20);
		{
			System.out.println("Design :"+keychain2.design );
			System.out.println("Cost :"+keychain2.cost);
			System.out.println("No of Keys :"+keychain2.noOfKeys);
			System.out.println("Type :"+keychain2.type);
			System.out.println("usedTO :"+keychain2.usedTO);
			System.out.println("======================");
		}
		KeyChain keychain3=new KeyChain("Flower",20,6);
		{
			System.out.println("Design :"+keychain3.design );
			System.out.println("Cost :"+keychain3.cost);
			System.out.println("No of Keys :"+keychain3.noOfKeys);
			System.out.println("Type :"+keychain3.type);
			System.out.println("usedTO :"+keychain3.usedTO);
			System.out.println("======================");
		}
		KeyChain keychain4=new KeyChain("Flower",20,6,"plastic","Hanging keys");
		{
			System.out.println("Design :"+keychain4.design );
			System.out.println("Cost :"+keychain4.cost);
			System.out.println("No of Keys :"+keychain4.noOfKeys);
			System.out.println("Type :"+keychain4.type);
			System.out.println("usedTO :"+keychain4.usedTO);
		}
	}
}