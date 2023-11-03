class FreeUnique
{
	public static void main(String[] args)
	{
        Free free=new Free();
		free.displayInfo();
		
		System.out.println("================");

        Free free1=new Free("Edu","all",true);
		free1.displayInfo();

        System.out.println("================");		
        
		Free free2=new Free("Course","CSR",true);		
		free2.displayInfo();
		
		System.out.println("================");
		
		Free free3=new Free("Hospital","camp",true);		
		free3.displayInfo();
		
		System.out.println("================");
		
		Free free4=new Free("Education","Poor",true);		
		free4.displayInfo();
		
		System.out.println("================");
		
		Free free5=new Free("Food","Prasada",true);		
		free5.displayInfo();
		
		System.out.println("================");
		
		Free free6=new Free("Cloth","Poor",true);		
		free6.displayInfo();
		
		System.out.println("================");
		
		Free free7=new Free("Books","Backward",true);		
		free7.displayInfo();
		
		System.out.println("================");
		
		Free free8=new Free("Uniform","Govt",true);		
		free8.displayInfo();
		
		System.out.println("================");
		
		Free free9=new Free("Ingreedients","shop",false);		
		free9.displayInfo();
		
		System.out.println("================");
		
		Free free10=new Free("water","supplies",true);		
		free10.displayInfo();
		
		System.out.println("================");
		
		Free free11=new Free("Food","Orphanage",true);		
		free11.displayInfo();
		
		
	}
	
}