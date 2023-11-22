class LgRemote extends Remote
{
	int warranty;
	int totalBatteries;
	
	LgRemote()
	{
		System.out.println("no arg const in LgRemote");
	}
	
	LgRemote(int totalButtons,String origin,RemoteUsedFor usedFor,int warranty,int totalBatteries)
	{
		super(totalButtons,origin,usedFor);
		this.warranty=warranty;
		this.totalBatteries=totalBatteries;
	}
	void voiceCommand()
	{
		System.out.println("Running on Voice Command Lg Remote");
	}
	
	@Override
	void on()
	{
		System.out.println("Running on in Lg Remote");
	}
	@Override
	void off()
	{
		System.out.println("Running off in Lg Remote");
	}
	@Override
	void increaseVolume()
	{
		System.out.println("Running increaseVolume in Lg Remote");
	}
	
	
}