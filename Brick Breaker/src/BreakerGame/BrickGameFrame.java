package BreakerGame;

import javax.swing.JFrame;

public class BrickGameFrame extends JFrame{
	
	BrickGameFrame(){
		
		Gameplay gamePlay = new Gameplay();
		BrickGameFrame brickGameFrame = new BrickGameFrame();
		brickGameFrame.setBounds(10, 10, 700, 600);
		brickGameFrame.setTitle("Brick Breaker");
		brickGameFrame.setResizable(false);
		brickGameFrame.setVisible(true);
		brickGameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		brickGameFrame.add(gamePlay);

		
	}


}
