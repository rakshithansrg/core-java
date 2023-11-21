class Camera
{
	String brand="Canon";
	CameraColor color=CameraColor.BLACK;
	int pixel;
	int bateryDuration;
	
	Camera()
	{
		System.out.println("no arg const in Camera");
	}
	Camera(int pixel,int bateryDuration)
	{
		this.pixel=pixel;
		this.bateryDuration=bateryDuration;
	}
	
}