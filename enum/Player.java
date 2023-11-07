class Player
{
	String name;
	Game game;
	
	void playGame(Game game)
	{
		System.out.println("Use play from Game");
		game.play();
	}
	
	void pauseGame(Game game)
	{
		System.out.println("Use pause from Game");
		game.pause();
		
	}
	void endGame(Game game)
	{
		System.out.println("Use pause from Game");
		game.end();
	}
	void showInfo()
	{
		System.out.println("Name :"+this.name);
		System.out.println("Game :"+this.game);
		if(this.game!=null)
		{
			System.out.println("Show");
			System.out.println("ID :"+this.game.id);
			System.out.println("Total Players :"+this.game.totalPlayers);
			System.out.println("Origin :"+this.game.origin);
		}
	}
}
