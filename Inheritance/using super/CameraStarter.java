class CameraStarter
{
	public static void main(String[] args)
	{
		Camera camera=new Camera();
		System.out.println("Brand :"+camera.brand);
		System.out.println("Color :"+camera.color);
		System.out.println("Pixel :"+camera.pixel);
		System.out.println("Batery Duration :"+camera.bateryDuration);
		
		DigitalCamera digi=new DigitalCamera();
		System.out.println("Brand :"+digi.brand);
		System.out.println("Color :"+digi.color);
		System.out.println("Pixel :"+digi.pixel);
		System.out.println("Batery Duration :"+digi.bateryDuration);
		
		HandCamera hand=new HandCamera();
		hand.handy(24);
		System.out.println("Brand :"+hand.brand);
		System.out.println("Color :"+hand.color);
		System.out.println("Pixel :"+hand.pixel);
		System.out.println("Batery Duration :"+hand.bateryDuration);
		System.out.println("Weight :"+hand.weight);
		
		
		
		
	}
}