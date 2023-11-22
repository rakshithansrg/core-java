class Remote
{
	RemoteUsedFor usedFor;
	int totalButtons;
	String origin;
	
	Remote(int totalButtons,String origin,RemoteUsedFor usedFor)
	{
		this.totalButtons=totalButtons;
		this.origin=origin;
		this.usedFor=usedFor;
		System.out.println("const as String and int "+totalButtons+","+origin);
	}
	Remote()
	{
		System.out.println("no arg const in Remote");
	}
	
	void on()
	{
		System.out.println("Running on in Remote");
	}
	
	void off()
	{
		System.out.println("Running off in Remote");
	}
	
	void increaseVolume()
	{
		System.out.println("Running increaseVolume in Remote");
	}
	void decreaseVolume()
	{
		System.out.println("Running decreaseVolume in Remote");
	}
	void changeChannel()
	{
		System.out.println("Running changeChannel in Remote");
	}
}