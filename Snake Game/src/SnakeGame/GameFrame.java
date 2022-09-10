package SnakeGame;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	GameFrame(){
		
		//Instead of this:
		//GamePanel panel = new GamePanel();
		//You can do this
		
		this.add(new GamePanel());
		this.setTitle("Snake Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		
	}

}
