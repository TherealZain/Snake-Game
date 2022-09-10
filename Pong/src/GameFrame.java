import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class GameFrame extends JFrame {

	GamePanel panel;

	
	GameFrame(){
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/**this.pack causes game frame to fit in to the game panel 
		 * so we will not have to set the same dimensions as
		 * the game panel
		 */
		this.pack();
		this.setVisible(true);
	this.setLocationRelativeTo(null);
		
	}

	

	
	
}
