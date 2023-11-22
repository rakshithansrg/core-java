class RemoteMain
{
	public static void main(String... args)
	{
		System.out.println("Starting main in RemoteMain");
		Remote rem=new Remote();
		
		Remote remote=new Remote(23,"China",RemoteUsedFor.CONTROLAC);
		remote.on();
		remote.off();
		remote.increaseVolume();
		remote.decreaseVolume();
		remote.changeChannel();
		
		System.out.println("Remote Used For :"+remote.usedFor);
		System.out.println("Remote Total Buttons :"+remote.totalButtons);
		System.out.println("Remote Origin :"+remote.origin);
		System.out.println("===========================");
		
		LgRemote lr=new LgRemote();
		
		LgRemote lg=new LgRemote(45,"India",RemoteUsedFor.CONTROLTV,2,4);
		lg.on();
		lg.off();
		lg.increaseVolume();
		lg.voiceCommand();
		System.out.println("Lg Remote Used For :"+lg.usedFor);
		System.out.println("Lg Remote Total Buttons :"+lg.totalButtons);
		System.out.println("LG Remote Origin :"+lg.origin);
		System.out.println("LG Remote Waranty :"+lg.warranty);
		System.out.println("LG Remote Total Batteries :"+lg.totalBatteries);
		
		System.out.println("Ending main in RemoteMain");
	}
}