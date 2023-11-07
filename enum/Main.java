class Main
{
	public static void main(String[] main)
	{
		
		
		Tent tent;
		tent=new Tent();
		tent.open();
		tent.close();
		tent.showInfo();
		
		Agent agent=new Agent();
		agent.openTent(tent);
		agent.closeTent(tent);
		agent.showInfo();
		
		System.out.println("=============");
		
		Game game;
		game=new Game();
		game.play();
		game.pause();
		game.end();
		game.showInfo();
		
		Player player;
		player=new Player();
		player.playGame(game);
		player.pauseGame(game);
		player.endGame(game);
		player.showInfo();
		
		
	}
}


       