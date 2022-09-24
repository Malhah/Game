package main;

import javax.swing.JPanel;
//import java.awt.Color;
import java.awt.Graphics;


public class GamePanel extends JPanel {
	//son class of JPanel 

	public GamePanel() {
//constructor
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.fillRect(100,100,200,50);
		
		
	}

}
