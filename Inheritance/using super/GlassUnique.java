class GlassUnique
{
	public static void main(String[] args)
	{
		Glass glass=new Glass();
		System.out.println("Length :"+glass.length);
		System.out.println("Thickness :"+glass.thickness);
		System.out.println("Type :"+glass.type);
		System.out.println("Usage :"+glass.usage);
		System.out.println("Brand :"+glass.brand);
		
		System.out.println("===================");
		
		LaminatedGlass lg=new LaminatedGlass(12,"medium","smooth","kotrt",4); 
		System.out.println("Length :"+lg.length);
		System.out.println("Thickness :"+lg.thickness);
		System.out.println("Type :"+lg.type);
		System.out.println("Usage :"+lg.usage);
		System.out.println("Brand :"+lg.brand);
		System.out.println("Waranty :"+lg.warranty);
		System.out.println("cost :"+lg.cost);
			
		System.out.println("===================");
		
		ToughenedGlass tg=new ToughenedGlass();
		System.out.println("Length :"+tg.length);
		System.out.println("Thickness :"+tg.thickness);
		System.out.println("Type :"+tg.type);
		System.out.println("Usage :"+tg.usage);
		System.out.println("Brand :"+tg.brand);
		System.out.println("Wieght :"+tg.wieght);
		System.out.println("OwnerName :"+tg.OwnerName);
		
		System.out.println("===================");
		
		TintedGlass tng=new TintedGlass();
		System.out.println("Length :"+tng.length);
		System.out.println("Thickness :"+tng.thickness);
		System.out.println("Type :"+tng.type);
		System.out.println("Usage :"+tng.usage);
		System.out.println("Brand :"+tng.brand);
		System.out.println("Wieght :"+tng.wieght);
		System.out.println("OwnerName :"+tng.OwnerName);
		
		System.out.println("===================");
		
		GorillaGlass gl=new GorillaGlass();
		System.out.println("Length :"+gl.length);
		System.out.println("Thickness :"+gl.thickness);
		System.out.println("Type :"+gl.type);
		System.out.println("Usage :"+gl.usage);
		System.out.println("Brand :"+gl.brand);
		System.out.println("Waranty :"+gl.warranty);
		System.out.println("cost :"+gl.cost);
		
	}
}