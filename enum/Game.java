class Game
{
	int id;
	TotalPlayers totalPlayers=TotalPlayers.RAKSHA;
	String origin;
	
	void play()
	{
		System.out.println("Game");
		System.out.println("ID :"+this.id);
		System.out.println("Origin :"+this.origin);
	}
	void pause()
	{
		System.out.println("Pause");	
	}
	void end()
	{
		System.out.println("end");	
	}
	void showInfo()
	{
		System.out.println("Show");
		System.out.println("ID :"+this.id);
		System.out.println("Total Players :"+this.totalPlayers);
		System.out.println("Origin :"+this.origin);
	}
}