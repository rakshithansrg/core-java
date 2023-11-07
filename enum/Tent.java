class Tent
{
	int slNo=4;
	Color color=Color.WHITE;
	int width;
	int height;
	
	boolean open()
	{
		System.out.println("Open");
		return true;
	}
	
	boolean close()
	{
		System.out.println("Close");
		return false;
	}
	
	void showInfo()
	{
		System.out.println("SL Name :"+slNo);
		System.out.println("Color :"+color);
		System.out.println("Width :"+width);
		System.out.println("height :"+height);
	}
}