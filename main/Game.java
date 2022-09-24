package main;
//this class is used to compose GamePanel &GameWindow
public class Game {
	private GameWindow gameWindow;
	private GamePanel gamePanel;
	
	public Game() {
		
		
		gamePanel= new GamePanel();
		//creates game panel object
		gameWindow= new GameWindow(gamePanel);
		//creates gamewindow obbject
		
		
	}
}
