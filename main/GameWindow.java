package main;

import javax.swing.JFrame;

public class GameWindow {

	private JFrame jframe;

	public GameWindow(GamePanel gamePanel) {
						//casting ^^
		jframe = new JFrame();
		//creating new object
		
		
		jframe.setSize(400, 400);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.add(gamePanel);
		jframe.setVisible(true);

	}

}
